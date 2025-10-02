package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.widget.NestedScrollView;
import com.dynatrace.android.callback.Callback;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final Handler P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f92a;
    public final AlertDialog b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener Q = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Callback.g(view);
            try {
                Message messageObtain = (view != alertController.o || (message3 = alertController.q) == null) ? (view != alertController.s || (message2 = alertController.u) == null) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                alertController.P.obtainMessage(1, alertController.b).sendToTarget();
                Callback.h();
            } catch (Throwable th) {
                Callback.h();
                throw th;
            }
        }
    };

    /* renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public final void a(NestedScrollView nestedScrollView) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            throw null;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class AlertParams {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;

        /* renamed from: a, reason: collision with root package name */
        public final Context f93a;
        public final LayoutInflater b;
        public Drawable d;
        public CharSequence e;
        public View f;
        public CharSequence g;
        public CharSequence h;
        public Drawable i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public Drawable l;
        public DialogInterface.OnClickListener m;
        public CharSequence n;
        public Drawable o;
        public DialogInterface.OnClickListener p;
        public DialogInterface.OnCancelListener r;
        public DialogInterface.OnDismissListener s;
        public DialogInterface.OnKeyListener t;
        public CharSequence[] u;
        public ListAdapter v;
        public DialogInterface.OnClickListener w;
        public int x;
        public View y;
        public int z;
        public int c = 0;
        public boolean D = false;
        public int H = -1;
        public boolean q = true;

        public interface OnPrepareListViewListener {
        }

        public AlertParams(Context context) {
            this.f93a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class ButtonHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f94a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f94a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {
        public final int d;
        public final int e;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.v);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, AlertDialog alertDialog, Window window) {
        this.f92a = context;
        this.b = alertDialog;
        this.c = window;
        ButtonHandler buttonHandler = new ButtonHandler();
        buttonHandler.f94a = new WeakReference(alertDialog);
        this.P = buttonHandler;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.f, com.woolworths.R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.O = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        alertDialog.c().w(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.P.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.x = charSequence;
            this.y = messageObtainMessage;
            this.z = drawable;
        } else if (i == -2) {
            this.t = charSequence;
            this.u = messageObtainMessage;
            this.v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.p = charSequence;
            this.q = messageObtainMessage;
            this.r = drawable;
        }
    }
}
