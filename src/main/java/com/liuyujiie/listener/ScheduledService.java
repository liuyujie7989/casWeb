package com.liuyujiie.listener;
import org.apache.commons.io.FileUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;


@Component
@Async
public class ScheduledService {


    //@Scheduled(cron = "*/5 * * * * ?")
    public void indexDataScheduled() {
        System.out.println("定时任务启动了。。。");
    }

    private Date getYesterday() {
        final Calendar ca = Calendar.getInstance();
        ca.setTime(new Date());
        ca.add(Calendar.DATE, -1);
        return ca.getTime();
    }


    /**
     * @Scheduled(fixedRate = 5000)
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void deleteDirBeforeYesterdayScheduled() {

    }


    /**
     * 递归删除目录下的所有文件及子目录下所有文件
     */
    private static void deleteDir(File dir) {
        try {
            FileUtils.deleteDirectory(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
