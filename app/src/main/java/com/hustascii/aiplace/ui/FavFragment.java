package com.hustascii.aiplace.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.hustascii.aiplace.adapter.AIContentAdapter;
import com.hustascii.aiplace.adapter.BaseContentAdapter;
import com.hustascii.aiplace.entity.QiangYu;
import com.hustascii.aiplace.ui.base.BaseContentFragment;


public class FavFragment extends BaseContentFragment {

	public static FavFragment newInstance(){
		FavFragment fragment = new FavFragment();
		return fragment;
	}
	
	@Override
	public BaseContentAdapter<QiangYu> getAdapter() {
		// TODO Auto-generated method stub
		return new AIContentAdapter(mContext, mListItems);
	}

	@Override
	public void onListItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
//		MyApplication.getInstance().setCurrentQiangYu(mListItems.get(position-1));
		Intent intent = new Intent();
		intent.setClass(getActivity(), CommentActivity.class);
		intent.putExtra("data", mListItems.get(position-1));
		startActivity(intent);
	}
}
