package com.dcs.test.Tools;

import java.util.Calendar;

/**
 * 节日
 * @author CJL
 *
 */
public class Festival {
	   public static String[][] permanentFestivalName = new String[13][32];
	   
	   public Festival(){
		   setPermanentFestivalName();
	   }
	   
	   public  void setPermanentFestivalName(){
		   permanentFestivalName[1][1] = "元旦";
		   permanentFestivalName[2][14] = "情人节";
		   permanentFestivalName[3][8] = "妇女节";
		   permanentFestivalName[3][12] = "植树节";
		   permanentFestivalName[4][1] = "愚人节";
		   permanentFestivalName[4][5] = "清明节";
		   permanentFestivalName[5][1] = "劳动节";
		   permanentFestivalName[5][4] = "青年节";
		   permanentFestivalName[5][12] = "护士节";
		   permanentFestivalName[6][1] = "儿童节";
		   permanentFestivalName[6][7] = "高考";
		   permanentFestivalName[6][8] = "高考";
		   permanentFestivalName[7][1] = "建党节";
		   permanentFestivalName[8][1] = "建军节";
		   permanentFestivalName[9][10] = "教师节";
		   permanentFestivalName[10][1] = "国庆节";
		   permanentFestivalName[10][31] = "万圣节";
		   permanentFestivalName[12][24] = "平安夜";
		   permanentFestivalName[12][25] = "圣诞节";
	   }

   
   public String getPermanentFestivalName(Calendar cal){
	   int month = cal.getTime().getMonth()+1;
	   int day = cal.getTime().getDate();
	   
	   if(permanentFestivalName[month][day]!=null && !permanentFestivalName[month][day].equals("") )
		   return permanentFestivalName[month][day];
	   
	   return null;
   }
   
   public String getDynamicFestivalName(Calendar cal){
	   int month = cal.getTime().getMonth()+1;
	   int week = cal.get(Calendar.WEEK_OF_MONTH);//获取是本月的第几周
	   int day = cal.get(Calendar.DAY_OF_WEEK);//获致是本周的第几天地, 1代表星期天...7代表星期六
	   
	   if(month == 5){
		   if(week==2 && day==1)
			   return "母亲节";
	   } else if (month == 6){
		   if(week==3 && day==1)
			   return "父亲节";
	   } else if (month == 11){
		   if(week==4 && day==5)
			   return "感恩节";
	   }
	   
	   return null;
   }
}
