package neusoft.oa.result;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

// 统一REST API结果类
public class Result<T> {
	private T result = null;
	private List<T> list = null;
	private int intReult = 0;
	private String strResult = null;
	private double doubleResult = 0;
	@JsonFormat(pattern="yyy-MM-dd")
	private Date dateResult = null;
	@JsonFormat(pattern="yyy-MM-dd HH:mm:ss")
	private Date timeResult = null;
	// 分页信息	
	private int count = 0;  // 个数
	private int pageCount = 0;  // 页数
	private int rows = 0;  // 当前页号
	private int pages = 0; // ?
	
	private String status = null; // 执行状态  OK/ERROR
	private String message = null; // 消息
	
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getIntReult() {
		return intReult;
	}
	public void setIntReult(int intReult) {
		this.intReult = intReult;
	}
	public String getStrResult() {
		return strResult;
	}
	public void setStrResult(String strResult) {
		this.strResult = strResult;
	}
	public double getDoubleResult() {
		return doubleResult;
	}
	public void setDoubleResult(double doubleResult) {
		this.doubleResult = doubleResult;
	}
	public Date getDateResult() {
		return dateResult;
	}
	public void setDateResult(Date dateResult) {
		this.dateResult = dateResult;
	}
	public Date getTimeResult() {
		return timeResult;
	}
	public void setTimeResult(Date timeResult) {
		this.timeResult = timeResult;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
}
