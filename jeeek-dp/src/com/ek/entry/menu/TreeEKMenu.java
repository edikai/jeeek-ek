/**
 * @program: ek
 * @Date: 2018/10/15 16:22
 * @Author: Qin_HQing
 * @Version: V1.0
 * @Description:
 **/
package com.ek.entry.menu;

import java.util.List;

public class TreeEKMenu {
	private String text;
	private String href;
	private int permsnId;
	private List<TreeEKMenu> nodes;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public int getPermsnId() {
		return permsnId;
	}
	
	public void setPermsnId(int permsnId) {
		this.permsnId = permsnId;
	}
	
	public List<TreeEKMenu> getNodes() {
		return nodes;
	}
	
	public void setNodes(List<TreeEKMenu> nodes) {
		this.nodes = nodes;
	}
}
