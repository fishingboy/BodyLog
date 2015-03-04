package com.leo_kuo.bodylog;

import android.content.Context;
import android.widget.Toast;

/**
 * 共用函式區
 * @author Leo Kuo <et282523@hotmail.com>
 */
public class Lib
{
    // 提示訊息
    public static void alert(Context context, String str)
    {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
