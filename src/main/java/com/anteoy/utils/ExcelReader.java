package com.anteoy.utils;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class ExcelReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelReader.class);

    Workbook wb = null;

    List<String[]> dataList = new ArrayList<String[]>();

    public ExcelReader(String fileName) {
        try {
            File file = new File(fileName);
            InputStream input = new FileInputStream(file);
            wb = WorkbookFactory.create(input);
        } catch (FileNotFoundException e) {
            LOGGER.error("ExcelReader处理异常 FileNotFoundException:"+e.getMessage());
        } catch (IOException e) {
            LOGGER.error("ExcelReader处理异常 IOException"+e.getMessage());
        } catch (EncryptedDocumentException e) {
            LOGGER.error("ExcelReader处理异常 EncryptedDocumentException"+e.getMessage());
        } catch (InvalidFormatException e) {
            // TODO Auto-generated catch block
            LOGGER.error("ExcelReader处理异常 InvalidFormatException"+e.getMessage());
        }
    }

    /**
     * 取Excel所有数据，包含header
     * @return List<String[]>
     * @throws Exception
     */
    public List<String[]> getAllData(int sheetIndex,int flag) throws Exception {

        try{
            int columnNum = 0;
            Sheet sheet = wb.getSheetAt(sheetIndex);
            if (sheet.getRow(0) != null) {
                columnNum = sheet.getRow(0).getLastCellNum()
                        - sheet.getRow(0).getFirstCellNum();
            }
            if (columnNum > 0) {
                for (Row row : sheet) {
                    String[] singleRow = new String[columnNum];
                    int n = 0;
                    for (int i = 0; i < columnNum; i++) {
                        Cell cell = row.getCell(i);
                        if(cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK){
                            singleRow[n] = "";
                            n++;
                            continue;
                        }
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_BLANK:
                                singleRow[n] = "";
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:
                                singleRow[n] = Boolean.toString(cell
                                        .getBooleanCellValue());
                                break;
                            // 数值
                            case Cell.CELL_TYPE_NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    singleRow[n] = sdf.format(date);
                                } else {
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    String temp = cell.getStringCellValue();
                                    // 判断是否包含小数点，如果不含小数点，则以字符串读取，如果含小数点，则转换为Double类型的字符串
                                    if (temp.indexOf(".") > -1) {
                                        singleRow[n] = String.valueOf(new Double(temp))
                                                .trim();
                                    } else {
                                        singleRow[n] = temp.trim();
                                    }
                                }
                                break;
                            case Cell.CELL_TYPE_STRING:
                                singleRow[n] = cell.getStringCellValue().trim();
                                break;
                            case Cell.CELL_TYPE_ERROR:
                                singleRow[n] = "";
                                break;
                            case Cell.CELL_TYPE_FORMULA:
                                cell.setCellType(Cell.CELL_TYPE_STRING);
                                singleRow[n] = cell.getStringCellValue();
                                if (singleRow[n] != null) {
                                    singleRow[n] = singleRow[n].replaceAll("#N/A", "")
                                            .trim();
                                }
                                break;
                            default:
                                singleRow[n] = "";
                                break;
                        }
                        n++;
                    }
                    if(flag == 1){
                        if (singleRow[0] == null || "".equals(singleRow[0])) {
                            continue;
                        }// 如果第一行为空，跳过
                    }
                    if ((singleRow[0] == null || "".equals(singleRow[0]))&&(singleRow[1] == null || "".equals(singleRow[1]))&&(singleRow[2] == null || "".equals(singleRow[2]))){
                        continue;
                    }// 如果第一行为空，跳过
                    dataList.add(singleRow);
                }
            }

        }catch (Exception e){
            LOGGER.error("ExcelReader处理异常 Exception:"+e.getMessage());
            return null;
        }
        return dataList;
    }

    /**
     * 取Excel所有数据，包含header
     * @return List<String[]>
     */
    public List<Map<String, String>> getAllDataToMap(int sheetIndex) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        try{
            int columnNum = 0;
            Sheet sheet = wb.getSheetAt(sheetIndex);
            if (sheet.getRow(0) != null) {
                columnNum = sheet.getRow(0).getLastCellNum()
                        - sheet.getRow(0).getFirstCellNum();
            }
            if (columnNum > 0) {
                for (Row row : sheet) {
                    String[] singleRow = new String[columnNum];
                    Map<String, String> map = new HashMap<String, String>();
                    int n = 0;
                    for (int i = 0; i < columnNum; i++) {
                        String mapKey = "";//map的key值
                        switch (i) {
                            case 0:
                                mapKey = "orderId";
                                break;
                            case 1:
                                mapKey = "appKey";
                                break;
                            case 2:
                                mapKey = "idCard";
                                break;
                            case 3:
                                mapKey = "documentNo";
                                break;
                            case 4:
                                mapKey = "isInsurance";
                                break;
                            case 5:
                                mapKey = "phoneUseTime";
                                break;
                            case 6:
                                mapKey = "phoneMonPay";
                                break;
                            case 7:
                                mapKey = "workTime";
                                break;
                            case 8:
                                mapKey = "name";
                                break;
                            case 9:
                                mapKey = "mobliePhone";
                                break;
                            case 10:
                                mapKey = "bankCard";
                                break;
                            case 11:
                                mapKey = "sex";
                                break;
                            case 12:
                                mapKey = "marry";
                                break;
                            case 13:
                                mapKey = "custType";
                                break;
                            case 14:
                                mapKey = "commodityType";
                                break;
                            case 15:
                                mapKey = "applyDate";
                                break;
                            case 16:
                                mapKey = "loanAmt";
                                break;
                            case 17:
                                mapKey = "price";
                                break;
                            case 18:
                                mapKey = "num";
                                break;
                            case 19:
                                mapKey = "monthPayAmt";
                                break;
                            case 20:
                                mapKey = "eduDegree";
                                break;
                            case 21:
                                mapKey = "houseProvince";
                                break;
                            case 22:
                                mapKey = "houseCity";
                                break;
                            case 23:
                                mapKey = "householdRegisterAddress";
                                break;
                            case 24:
                                mapKey = "liveProvince";
                                break;
                            case 25:
                                mapKey = "liveCity";
                                break;
                            case 26:
                                mapKey = "liveTime";
                                break;
                            case 27:
                                mapKey = "livingAddress";
                                break;
                            case 28:
                                mapKey = "residentialProperty";
                                break;
                            case 29:
                                mapKey = "unitName";
                                break;
                            case 30:
                                mapKey = "unitNature";
                                break;
                            case 31:
                                mapKey = "unitScale";
                                break;
                            case 32:
                                mapKey = "unitNature";
                                break;
                            case 33:
                                mapKey = "unitProvince";
                                break;
                            case 34:
                                mapKey = "unitCity";
                                break;
                            case 35:
                                mapKey = "workAddress";
                                break;
                            case 36:
                                mapKey = "motherName";
                                break;
                            case 37:
                                mapKey = "motherPhoneNum";
                                break;
                            case 38:
                                mapKey = "fatherName";
                                break;
                            case 39:
                                mapKey = "fatherPhoneNum";
                                break;
                            case 40:
                                mapKey = "spouseName";
                                break;
                            case 41:
                                mapKey = "spousePhoneNum";
                                break;
                            case 42:
                                mapKey = "workPersonName";
                                break;
                            case 43:
                                mapKey = "workPersonPhoneNum";
                                break;
                            case 44:
                                mapKey = "colleagueName";
                                break;
                            case 45:
                                mapKey = "colleaguePhoneNum";
                                break;
                            case 46:
                                mapKey = "person1Name";
                                break;
                            case 47:
                                mapKey = "person1Phone";
                                break;
                            case 48:
                                mapKey = "person2Name";
                                break;
                            case 49:
                                mapKey = "person2Phone";
                                break;
                            case 50:
                                mapKey = "person3Name";
                                break;
                            case 51:
                                mapKey = "person3Phone";
                                break;
                        }

                        Cell cell = row.getCell(i);
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_BLANK:
                                map.put(mapKey, "");
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:
                                map.put(mapKey,
                                        Boolean.toString(cell.getBooleanCellValue()));
                                break;
                            // 数值
                            case Cell.CELL_TYPE_NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    SimpleDateFormat sdf = new SimpleDateFormat(
                                            "yyyy-MM-dd");
                                    map.put(mapKey, sdf.format(date));
                                } else {
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    String temp = cell.getStringCellValue();
                                    // 判断是否包含小数点，如果不含小数点，则以字符串读取，如果含小数点，则转换为Double类型的字符串
                                    if (temp.indexOf(".") > -1) {
                                        map.put(mapKey, String
                                                .valueOf(new Double(temp)).trim());
                                    } else {
                                        map.put(mapKey, temp.trim());
                                    }
                                }
                                break;
                            case Cell.CELL_TYPE_STRING:
                                map.put(mapKey, cell.getStringCellValue().trim());
                                break;
                            case Cell.CELL_TYPE_ERROR:
                                map.put(mapKey, "");
                                break;
                            case Cell.CELL_TYPE_FORMULA:
                                cell.setCellType(Cell.CELL_TYPE_STRING);
                                map.put(mapKey, cell.getStringCellValue());
                                if (singleRow[n] != null) {
                                    map.put(mapKey, singleRow[n].replaceAll("#N/A", "")
                                            .trim());
                                }
                                break;
                            default:
                                map.put(mapKey, "");
                                break;
                        }
                        n++;
                    }
                    if ("".equals(singleRow[0])) {
                        continue;
                    }// 如果第一行为空，跳过
                    mapList.add(map);
                }
            }
        }catch (Exception e){
            LOGGER.error("ExcelReader处理异常");
            LOGGER.error(e.getMessage(), e);
        }

        return mapList;
    }

    /**
     * 返回Excel最大行index值，实际行数要加1
     * @return
     */
    public int getRowNum(int sheetIndex) {
        Sheet sheet = wb.getSheetAt(sheetIndex);
        return sheet.getLastRowNum();
    }

    /**
     * 返回数据的列数
     *
     * @return
     */
    public int getColumnNum(int sheetIndex) {
        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = sheet.getRow(0);
        if (row != null && row.getLastCellNum() > 0) {
            return row.getLastCellNum();
        }
        return 0;
    }

    /**
     * 获取某一行数据
     * @param sheetIndex 计数从0开始，工作簿
     * @param rowIndex 计数从0开始，rowIndex为0代表header行
     * @return
     */
    public String[] getRowData(int sheetIndex, int rowIndex) {
        try{
            String[] dataArray = null;
            if (rowIndex > this.getColumnNum(sheetIndex)) {
                return dataArray;
            } else {
                dataArray = new String[this.getColumnNum(sheetIndex)];
                return this.dataList.get(rowIndex);
            }
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
        }
        return null;
    }

    /**
     * 获取某一列数据
     * @param colIndex
     * @return
     */
    public String[] getColumnData(int sheetIndex, int colIndex) {
        String[] dataArray = null;
        try{
            if (colIndex > this.getColumnNum(sheetIndex)) {
                return dataArray;
            } else {
                if (this.dataList != null && this.dataList.size() > 0) {
                    dataArray = new String[this.getRowNum(sheetIndex) + 1];
                    int index = 0;
                    for (String[] rowData : dataList) {
                        if (rowData != null) {
                            dataArray[index] = rowData[colIndex];
                            index++;
                        }
                    }
                }
            }
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
        }

        return dataArray;

    }
}

