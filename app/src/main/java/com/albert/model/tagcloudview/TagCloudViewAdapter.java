package com.albert.model.tagcloudview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moxun.tagcloudlib.view.TagsAdapter;

import java.util.List;

/**
 * Author： Albert
 * Blog:
 * Date:2018/11/21
 * Description:自定义adapter
 */

public class TagCloudViewAdapter extends TagsAdapter{

    private List<String> mList;

    public TagCloudViewAdapter(List<String> list) {
        this.mList = list;
    }

    /**
     * @return 返回Tag数量
     */
    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * 返回每个Tag实例
     * @param context
     * @param position
     * @param parent
     * @return
     */
    @Override
    public View getView(Context context, int position, ViewGroup parent) {
        TextView tvTag = (TextView) View.inflate(context,R.layout.item_tag,null);
        tvTag.setText(getItem(position));
        return tvTag;
    }

    /**
     * 返回Tag数据
     * @param position
     * @return
     */
    @Override
    public String getItem(int position) {
        return mList.get(position);
    }

    /**
     * 针对每个Tag返回一个权重值，该值与ThemeColor和Tag初始大小有关；一个简单的权重值生成方式是对一个数N取余或使用随机数
     * @param position
     * @return
     */
    @Override
    public int getPopularity(int position) {
        return 1;
    }

    /**
     * Tag主题色发生变化时会回调该方法
     * @param view
     * @param themeColor
     */
    @Override
    public void onThemeColorChanged(View view, int themeColor) {

    }
}
