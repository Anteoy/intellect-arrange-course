package com.anteoy.utils;

import com.anteoy.common.Code;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class ExcelSample {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelSample.class);

    public static void main(String[] args) {
        ExcelReader reader = null;
        Map<String, Object> errorLogMap = new HashMap<>();
        try {
            reader = new ExcelReader("/home/zhoudazhuang/class100/j8/intellect-arrange-course/upload-dir/new+platform+schedule+Nov.6-10..xlsx");
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            errorLogMap.put("errorCode", Code.READ_EXCEL_ERRORCODE);
            errorLogMap.put("errorMsg", "excel文件读取错误");
        }
        List<String[]> lists;
        try {
            lists = reader.getAllData(0,0);
            if (lists.size() < 1) {
                LOGGER.info("lists.size() < 1");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            errorLogMap.put("errorCode", Code.ANALYSIS_EXCEL_ERRORCODE);
            for (int j = 1; j < lists.size(); j++) {
                if (j > Code.MAXSENDNUMBER) {
                    LOGGER.info("超出2000条处理限制,数据将不会进行提交！");
                }
                String[] strs = lists.get(j);
                errorLogMap.put("rowNum", j);
                Map<String,String> model = new HashMap<>();
                for (int i = 0; i < strs.length; i++) {
                    LOGGER.info("case"+i+":"+strs[i]);
                    switch (i) {
                        case 0:
                            try {
                            } catch (Exception e) {
                                errorLogMap.put("colNum", 1);
                                errorLogMap.put("errorMsg", "xxx【" + strs[i] + "】解析错误");
                            }
                            break;
                        case 1:
                            try {
                            } catch (Exception e) {
                                errorLogMap.put("colNum", 2);
                                errorLogMap.put("errorMsg", "xxx【" + strs[i] + "】解析错误");
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            errorLogMap.put("errorCode", Code.ANALYSIS_EXCEL_ERRORCODE);
            errorLogMap.put("errorMsg", "excel表格文件信息读取失败");
        }
    }
}
