package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class AppCompatTextViewAutoSizeHelper {
    public static final ConcurrentHashMap i;

    /* renamed from: a, reason: collision with root package name */
    public int f171a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public boolean f = false;
    public final TextView g;
    public final Context h;

    @RequiresApi
    public static final class Api23Impl {
        @NonNull
        @DoNotInline
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull Impl impl) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                impl.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class Impl {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }
    }

    @RequiresApi
    public static class Impl23 extends Impl {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.c(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi
    public static class Impl29 extends Impl23 {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    static {
        new RectF();
        i = new ConcurrentHashMap();
    }

    public AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new Impl29();
        } else {
            new Impl23();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method b(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = i;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object c(TextView textView, String str, Object obj) {
        try {
            return b(str).invoke(textView, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj;
        }
    }

    public final boolean d() {
        return !(this.g instanceof AppCompatEditText);
    }
}
