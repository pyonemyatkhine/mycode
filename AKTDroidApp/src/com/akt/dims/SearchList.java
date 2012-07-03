package com.akt.dims;


import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class SearchList  extends LinearLayout{

	// To store skill information
	private StockItem stock;
	// For UI
	private Context context;
	private RadioButton rdoSelect;
	private TextView tvItemCode;
	private TextView tvItemName;
	
	public SearchList(Context context,StockItem item) {
		super(context);
		// TODO Auto-generated constructor stub
		this.context=context;
		this.stock=item;
		this.rdoSelect.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
				SearchList.this.stock.setSelected(((RadioButton) view).isChecked());
			}
		});

		this.tvItemCode = new TextView(this.context);
		this.tvItemCode.setTextSize(15);
		this.tvItemCode.setText(" " + this.stock.getItemCode());

		this.tvItemName = new TextView(this.context);
		this.tvItemName.setTextSize(15);
		this.tvItemName.setText(" " + this.stock.getItemName());
		
		// Add components to main layout
		this.setOrientation(HORIZONTAL);
		this.addView(this.tvItemCode, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		this.addView(this.tvItemName, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		this.addView(this.rdoSelect, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	}

	public StockItem getStockItem()
	{
		return stock;
	}

	public void setStockItem(StockItem stock)
	{
		this.stock = stock;
	}
}
