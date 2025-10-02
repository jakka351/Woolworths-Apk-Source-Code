package androidx.constraintlayout.motion.widget;

import YU.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;

@SuppressLint
/* loaded from: classes2.dex */
public class Debug {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String c(int i, Context context) throws Resources.NotFoundException {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            i = context.getResources().getResourceEntryName(i);
            return i;
        } catch (Exception unused) {
            return a.d(i, "?");
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
