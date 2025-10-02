package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController i;

    public static class Builder {
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.g(0, context));
        }

        @NonNull
        public AlertDialog create() {
            final AlertController alertController;
            final AlertController.RecycleListView recycleListView;
            ListAdapter simpleCursorAdapter;
            AlertDialog alertDialog = new AlertDialog(this.P.f93a, this.mTheme);
            final AlertController.AlertParams alertParams = this.P;
            View view = alertParams.f;
            final AlertController alertController2 = alertDialog.i;
            if (view != null) {
                alertController2.G = view;
            } else {
                CharSequence charSequence = alertParams.e;
                if (charSequence != null) {
                    alertController2.e = charSequence;
                    TextView textView = alertController2.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.d;
                if (drawable != null) {
                    alertController2.C = drawable;
                    alertController2.B = 0;
                    ImageView imageView = alertController2.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController2.D.setImageDrawable(drawable);
                    }
                }
                int i = alertParams.c;
                if (i != 0) {
                    alertController2.C = null;
                    alertController2.B = i;
                    ImageView imageView2 = alertController2.D;
                    if (imageView2 != null) {
                        if (i != 0) {
                            imageView2.setVisibility(0);
                            alertController2.D.setImageResource(alertController2.B);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = alertParams.g;
            if (charSequence2 != null) {
                alertController2.f = charSequence2;
                TextView textView2 = alertController2.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.h;
            if (charSequence3 != null || alertParams.i != null) {
                alertController2.c(-1, charSequence3, alertParams.j, alertParams.i);
            }
            CharSequence charSequence4 = alertParams.k;
            if (charSequence4 != null || alertParams.l != null) {
                alertController2.c(-2, charSequence4, alertParams.m, alertParams.l);
            }
            CharSequence charSequence5 = alertParams.n;
            if (charSequence5 != null || alertParams.o != null) {
                alertController2.c(-3, charSequence5, alertParams.p, alertParams.o);
            }
            if (alertParams.u == null && alertParams.J == null && alertParams.v == null) {
                alertController = alertController2;
            } else {
                final AlertController.RecycleListView recycleListView2 = (AlertController.RecycleListView) alertParams.b.inflate(alertController2.K, (ViewGroup) null);
                if (!alertParams.F) {
                    alertController = alertController2;
                    recycleListView = recycleListView2;
                    int i2 = alertParams.G ? alertController.M : alertController.N;
                    if (alertParams.J != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(alertParams.f93a, i2, alertParams.J, new String[]{alertParams.K}, new int[]{R.id.text1});
                    } else {
                        ListAdapter checkedItemAdapter = alertParams.v;
                        if (checkedItemAdapter == null) {
                            checkedItemAdapter = new AlertController.CheckedItemAdapter(alertParams.f93a, i2, R.id.text1, alertParams.u);
                        }
                        simpleCursorAdapter = checkedItemAdapter;
                    }
                } else if (alertParams.J == null) {
                    final Context context = alertParams.f93a;
                    final int i3 = alertController2.L;
                    recycleListView = recycleListView2;
                    final CharSequence[] charSequenceArr = alertParams.u;
                    simpleCursorAdapter = new ArrayAdapter<CharSequence>(context, i3, charSequenceArr) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public final View getView(int i4, View view2, ViewGroup viewGroup) {
                            View view3 = super.getView(i4, view2, viewGroup);
                            boolean[] zArr = AlertParams.this.E;
                            if (zArr != null && zArr[i4]) {
                                recycleListView.setItemChecked(i4, true);
                            }
                            return view3;
                        }
                    };
                    alertController = alertController2;
                } else {
                    final Context context2 = alertParams.f93a;
                    final Cursor cursor = alertParams.J;
                    simpleCursorAdapter = new CursorAdapter(context2, cursor, recycleListView2, alertController2) { // from class: androidx.appcompat.app.AlertController.AlertParams.2
                        public final int d;
                        public final int e;
                        public final /* synthetic */ RecycleListView f;
                        public final /* synthetic */ AlertController g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context2, cursor, false);
                            this.f = recycleListView2;
                            this.g = alertController2;
                            Cursor cursor2 = getCursor();
                            this.d = cursor2.getColumnIndexOrThrow(AlertParams.this.K);
                            this.e = cursor2.getColumnIndexOrThrow(AlertParams.this.L);
                        }

                        @Override // android.widget.CursorAdapter
                        public final void bindView(View view2, Context context3, Cursor cursor2) {
                            ((CheckedTextView) view2.findViewById(R.id.text1)).setText(cursor2.getString(this.d));
                            this.f.setItemChecked(cursor2.getPosition(), cursor2.getInt(this.e) == 1);
                        }

                        @Override // android.widget.CursorAdapter
                        public final View newView(Context context3, Cursor cursor2, ViewGroup viewGroup) {
                            return AlertParams.this.b.inflate(this.g.L, viewGroup, false);
                        }
                    };
                    alertController = alertController2;
                    recycleListView = recycleListView2;
                }
                alertController.H = simpleCursorAdapter;
                alertController.I = alertParams.H;
                if (alertParams.w != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i4, long j) {
                            AlertController alertController3 = alertController;
                            AlertParams alertParams2 = AlertParams.this;
                            Callback.j(view2);
                            try {
                                alertParams2.w.onClick(alertController3.b, i4);
                                if (!alertParams2.G) {
                                    alertController3.b.dismiss();
                                }
                                Callback.k();
                            } catch (Throwable th) {
                                Callback.k();
                                throw th;
                            }
                        }
                    });
                } else if (alertParams.I != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i4, long j) {
                            AlertParams alertParams2 = AlertParams.this;
                            Callback.j(view2);
                            try {
                                boolean[] zArr = alertParams2.E;
                                RecycleListView recycleListView3 = recycleListView;
                                if (zArr != null) {
                                    zArr[i4] = recycleListView3.isItemChecked(i4);
                                }
                                alertParams2.I.onClick(alertController.b, i4, recycleListView3.isItemChecked(i4));
                                Callback.k();
                            } catch (Throwable th) {
                                Callback.k();
                                throw th;
                            }
                        }
                    });
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = alertParams.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (alertParams.G) {
                    recycleListView.setChoiceMode(1);
                } else if (alertParams.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.g = recycleListView;
            }
            View view2 = alertParams.y;
            if (view2 == null) {
                int i4 = alertParams.x;
                if (i4 != 0) {
                    alertController.h = null;
                    alertController.i = i4;
                    alertController.n = false;
                }
            } else if (alertParams.D) {
                int i5 = alertParams.z;
                int i6 = alertParams.A;
                int i7 = alertParams.B;
                int i8 = alertParams.C;
                alertController.h = view2;
                alertController.i = 0;
                alertController.n = true;
                alertController.j = i5;
                alertController.k = i6;
                alertController.l = i7;
                alertController.m = i8;
            } else {
                alertController.h = view2;
                alertController.i = 0;
                alertController.n = false;
            }
            alertDialog.setCancelable(this.P.q);
            if (this.P.q) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.r);
            alertDialog.setOnDismissListener(this.P.s);
            DialogInterface.OnKeyListener onKeyListener = this.P.t;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.P.f93a;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.v = listAdapter;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.P.q = z;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.K = str;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.P.f = view;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.P.c = i;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.P.f93a.getTheme().resolveAttribute(i, typedValue, true);
            this.P.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z) {
            this.P.getClass();
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = alertParams.f93a.getResources().getTextArray(i);
            this.P.w = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.g = alertParams.f93a.getText(i);
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = alertParams.f93a.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.I = onMultiChoiceClickListener;
            alertParams2.E = zArr;
            alertParams2.F = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.k = alertParams.f93a.getText(i);
            this.P.m = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.P.l = drawable;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.n = alertParams.f93a.getText(i);
            this.P.p = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.P.o = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.r = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.s = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.t = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.h = alertParams.f93a.getText(i);
            this.P.j = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.P.i = drawable;
            return this;
        }

        @RestrictTo
        public Builder setRecycleOnMeasureEnabled(boolean z) {
            this.P.getClass();
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = alertParams.f93a.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.w = onClickListener;
            alertParams2.H = i2;
            alertParams2.G = true;
            return this;
        }

        public Builder setTitle(@StringRes int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.e = alertParams.f93a.getText(i);
            return this;
        }

        public Builder setView(int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.y = null;
            alertParams.x = i;
            alertParams.D = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder(@NonNull Context context, @StyleRes int i) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.g(i, context)));
            this.mTheme = i;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.P.d = drawable;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.P.g = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.P.e = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = charSequenceArr;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.k = charSequence;
            alertParams.m = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.n = charSequence;
            alertParams.p = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.h = charSequence;
            alertParams.j = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.y = view;
            alertParams.x = 0;
            alertParams.D = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = charSequenceArr;
            alertParams.I = onMultiChoiceClickListener;
            alertParams.E = zArr;
            alertParams.F = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.w = onClickListener;
            alertParams.H = i;
            alertParams.K = str;
            alertParams.G = true;
            return this;
        }

        @RestrictTo
        @Deprecated
        public Builder setView(View view, int i, int i2, int i3, int i4) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.y = view;
            alertParams.x = 0;
            alertParams.D = true;
            alertParams.z = i;
            alertParams.A = i2;
            alertParams.B = i3;
            alertParams.C = i4;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.I = onMultiChoiceClickListener;
            alertParams.L = str;
            alertParams.K = str2;
            alertParams.F = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.u = charSequenceArr;
            alertParams.w = onClickListener;
            alertParams.H = i;
            alertParams.G = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.v = listAdapter;
            alertParams.w = onClickListener;
            alertParams.H = i;
            alertParams.G = true;
            return this;
        }
    }

    public AlertDialog(Context context, int i) {
        super(context, g(i, context));
        this.i = new AlertController(getContext(), this, getWindow());
    }

    public static int g(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.woolworths.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button e(int i) {
        AlertController alertController = this.i;
        if (i == -3) {
            return alertController.w;
        }
        if (i == -2) {
            return alertController.s;
        }
        if (i == -1) {
            return alertController.o;
        }
        alertController.getClass();
        return null;
    }

    public final AlertController.RecycleListView f() {
        return this.i.g;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.i;
        alertController.b.setContentView(alertController.J);
        Context context = alertController.f92a;
        Window window = alertController.c;
        View viewFindViewById2 = window.findViewById(com.woolworths.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.woolworths.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.woolworths.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.woolworths.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.woolworths.R.id.customPanel);
        View viewInflate = alertController.h;
        if (viewInflate == null) {
            viewInflate = alertController.i != 0 ? LayoutInflater.from(context).inflate(alertController.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.woolworths.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.woolworths.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.woolworths.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.woolworths.R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.woolworths.R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        int i3 = alertController.d;
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        alertController.o = button;
        View.OnClickListener onClickListener = alertController.Q;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
            i = 0;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        alertController.s = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        alertController.w = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.woolworths.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupB.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.woolworths.R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.e) || !alertController.O) {
                window.findViewById(com.woolworths.R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.woolworths.R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i4 = alertController.B;
                if (i4 != 0) {
                    alertController.D.setImageResource(i4);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(com.woolworths.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f == null && alertController.g == null) ? view : viewGroupB.findViewById(com.woolworths.R.id.titleDividerNoCustom);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(com.woolworths.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.g;
        if (recycleListView != null && (!z3 || i5 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i5 != 0 ? recycleListView.getPaddingTop() : recycleListView.d, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.e);
        }
        if (!z2) {
            ViewGroup viewGroup3 = alertController.g;
            if (viewGroup3 == null) {
                viewGroup3 = alertController.A;
            }
            if (viewGroup3 != null) {
                int i6 = z3 ? 2 : i2;
                View viewFindViewById11 = window.findViewById(com.woolworths.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.woolworths.R.id.scrollIndicatorDown);
                ViewCompat.L(viewGroup3, i5 | i6);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.g;
        if (recycleListView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i7 = alertController.I;
        if (i7 > -1) {
            recycleListView2.setItemChecked(i7, true);
            recycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.i.A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.i.A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.i;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
