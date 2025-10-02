package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.SimpleArrayMap;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final SimpleArrayMap h = new SimpleArrayMap(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f106a = new Object[2];

    /* loaded from: classes2.dex */
    public static class DeclaredOnClickListener implements View.OnClickListener {
        public final View d;
        public final String e;
        public Method f;
        public Context g;

        public DeclaredOnClickListener(View view, String str) {
            this.d = view;
            this.e = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (true) {
                String str2 = this.e;
                if (context == null) {
                    View view = this.d;
                    int id = view.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f = method;
                        this.g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                if (this.f == null) {
                    a(this.d.getContext());
                }
                try {
                    this.f.invoke(this.g, view);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException("Could not execute method for android:onClick", e2);
                }
            } finally {
                Callback.h();
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        SimpleArrayMap simpleArrayMap = h;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f106a);
    }
}
