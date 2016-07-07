/**
 * 
 */
package com.home.job;

import java.sql.Timestamp;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
 
/**
 * @author Administrator
 *
 */
public class DummyJob implements Job {

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		
		System.out.println("Auto trigger at " + new Timestamp(System.currentTimeMillis()));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
