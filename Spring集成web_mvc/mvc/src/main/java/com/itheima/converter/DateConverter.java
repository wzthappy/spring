package com.itheima.converter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@PropertySource("classpath:date.properties")  // 读取资源文件
public class DateConverter implements Converter<String, Date> {  // 自定义转换器
  @Value("${date}")
  private String dateStr;
  /*
       转换 日期格式
   */
  @Override
  public Date convert(String dateStr) {
    // 将日期字符串转换成日期对象，返回
    SimpleDateFormat format = new SimpleDateFormat(dateStr);
    Date date = null;
    try {
      date = format.parse(dateStr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
}
