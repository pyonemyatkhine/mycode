package com.akt.dims;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ItemListActivity extends Activity {

	private ListView listViewItems = null;
	private List<StockItem> items = null;

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		this.listViewItems = (ListView) this.findViewById(R.id.lv_items);

		this.items = new ArrayList<StockItem>();
		StockItem stock = null;

		stock = new StockItem();
		stock.setItemCode("0001");
		stock.setItemName("Java");
		this.items.add(stock);

		stock = new StockItem();
		stock.setItemCode("0002");
		stock.setItemName("PHP");
		this.items.add(stock);

		stock.setItemCode("0003");
		stock.setItemName("Java");
		this.items.add(stock);

		stock = new StockItem();
		stock.setItemCode("0004");
		stock.setItemName("PHP");
		this.items.add(stock);

		stock.setItemCode("0005");
		stock.setItemName("Java");
		this.items.add(stock);

		stock = new StockItem();
		stock.setItemCode("0006");
		stock.setItemName("PHP");
		this.items.add(stock);

		StockItemAdapter adapter = new StockItemAdapter(this, this.items);
		this.listViewItems.setAdapter(adapter);
	}
	
	private void getSelectedStock()
	{
		List<StockItem> selectedStock = new ArrayList<StockItem>();
		for(StockItem s: this.items)
		{
			if(s.isSelected())
				selectedStock.add(s); // Here you will get your selected skill in this list.
		}
	}
}
