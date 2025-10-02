package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes6.dex */
public class z extends AlertDialog.Builder {
    public z(@NonNull Context context, int i, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, i);
        a(str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    private void a(String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        if (!TextUtils.isEmpty(str4)) {
            try {
                setTitle(str4);
            } catch (Exception e) {
                a4.b(e.getMessage());
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            try {
                setMessage(str5);
            } catch (Exception e2) {
                a4.b(e2.getMessage());
            }
        }
        if (onClickListener != null) {
            try {
                setPositiveButton(str, onClickListener);
            } catch (Exception e3) {
                a4.b(e3.getMessage());
            }
        }
        if (onClickListener2 != null) {
            try {
                setNegativeButton(str2, onClickListener2);
            } catch (Exception e4) {
                a4.b(e4.getMessage());
            }
        }
        if (onClickListener3 != null) {
            try {
                setNeutralButton(str3, onClickListener3);
            } catch (Exception e5) {
                a4.b(e5.getMessage());
            }
        }
        if (onCancelListener != null) {
            try {
                setOnCancelListener(onCancelListener);
            } catch (Exception e6) {
                a4.b(e6.getMessage());
            }
        }
    }
}
