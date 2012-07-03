package com.akt.dims;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class StockItemAdapter extends BaseAdapter {
	private Context context = null;
	private List<StockItem> itemList = null;

	public StockItemAdapter(Context context, List<StockItem> itemList)
	{
		this.context = context;
		this.itemList = itemList;
	}

	public int getCount()
	{
		return this.itemList != null ? this.itemList.size() : 0;
	}

	public Object getItem(int position)
	{
		return this.itemList != null ? this.itemList.get(position) : null;
	}

	public String getItemCode(int position)
	{
		if (this.itemList != null)
		{
			StockItem p = this.itemList.get(position);
			return p.getItemCode();
		}
		return "";
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		SearchList skillView;

		if (convertView == null)
		{
			skillView = new SearchList(this.context, this.itemList.get(position));
		} else
		{
			skillView = (SearchList) convertView;
			skillView.setStockItem(this.itemList.get(position));
		}
		return skillView;
	}

	public List<StockItem> getStockList()
	{
		return this.itemList;
	}

	@Override
	public long getItemId(int position) {
		if (this.itemList != null)
		{
			StockItem p = this.itemList.get(position);
			return p.getId();
		}
		return 0;
	}
}
