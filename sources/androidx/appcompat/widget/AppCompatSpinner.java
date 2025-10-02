package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import com.dynatrace.android.callback.Callback;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    public static final int[] l = {R.attr.spinnerMode};
    public final AppCompatBackgroundHelper d;
    public final Context e;
    public final ForwardingListener f;
    public SpinnerAdapter g;
    public final boolean h;
    public final SpinnerPopup i;
    public int j;
    public final Rect k;

    @RequiresApi
    public static final class Api23Impl {
        @DoNotInline
        public static void a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @VisibleForTesting
    public class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {
        public AlertDialog d;
        public ListAdapter e;
        public CharSequence f;

        public DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final boolean b() {
            AlertDialog alertDialog = this.d;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final Drawable c() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void d(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void dismiss() {
            AlertDialog alertDialog = this.d;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.d = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void f(int i, int i2) {
            if (this.e == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog alertDialogCreate = builder.setSingleChoiceItems(this.e, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.d = alertDialogCreate;
            AlertController.RecycleListView recycleListViewF = alertDialogCreate.f();
            recycleListViewF.setTextDirection(i);
            recycleListViewF.setTextAlignment(i2);
            this.d.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int g() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int j() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence m() {
            return this.f;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void n(CharSequence charSequence) {
            this.f = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void o(ListAdapter listAdapter) {
            this.e = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i, this.e.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    public static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter d;
        public ListAdapter e;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        public CharSequence F;
        public ListAdapter G;
        public final Rect H;
        public int I;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.H = new Rect();
            this.r = AppCompatSpinner.this;
            this.B = true;
            this.C.setFocusable(true);
            this.s = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                    Callback.j(view);
                    try {
                        appCompatSpinner.setSelection(i2);
                        if (appCompatSpinner.getOnItemClickListener() != null) {
                            appCompatSpinner.performItemClick(view, i2, ((DropDownAdapter) dropdownPopup.G).getItemId(i2));
                        }
                        dropdownPopup.dismiss();
                        Callback.k();
                    } catch (Throwable th) {
                        Callback.k();
                        throw th;
                    }
                }
            };
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void e(int i) {
            this.I = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            PopupWindow popupWindow = this.C;
            boolean zIsShowing = popupWindow.isShowing();
            s();
            popupWindow.setInputMethodMode(2);
            a();
            DropDownListView dropDownListView = this.f;
            dropDownListView.setChoiceMode(1);
            dropDownListView.setTextDirection(i);
            dropDownListView.setTextAlignment(i2);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.f;
            if (popupWindow.isShowing() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                    dropdownPopup.getClass();
                    if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(dropdownPopup.H)) {
                        dropdownPopup.dismiss();
                    } else {
                        dropdownPopup.s();
                        dropdownPopup.a();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence m() {
            return this.F;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void n(CharSequence charSequence) {
            this.F = charSequence;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.G = listAdapter;
        }

        public final void s() {
            int i;
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            Rect rect = appCompatSpinner.k;
            PopupWindow popupWindow = this.C;
            Drawable background = popupWindow.getBackground();
            if (background != null) {
                background.getPadding(rect);
                i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
            } else {
                i = 0;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i2 = appCompatSpinner.j;
            if (i2 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.G, popupWindow.getBackground());
                int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
                if (iA > i3) {
                    iA = i3;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i2);
            }
            this.i = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.h) - this.I) + i : paddingLeft + this.I + i;
        }
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f166a;
        public int b;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f166a = propertyMapper.mapObject("backgroundTint", com.woolworths.R.attr.backgroundTint);
            this.b = propertyMapper.mapObject("backgroundTintMode", com.woolworths.R.attr.backgroundTintMode);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
            propertyReader.readObject(this.f166a, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.b, appCompatSpinner.getBackgroundTintMode());
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean d;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.d = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        }
    }

    @VisibleForTesting
    public interface SpinnerPopup {
        boolean b();

        Drawable c();

        void d(int i);

        void dismiss();

        void e(int i);

        void f(int i, int i2);

        int g();

        int j();

        void l(int i);

        CharSequence m();

        void n(CharSequence charSequence);

        void o(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.k;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.i;
        return spinnerPopup != null ? spinnerPopup.j() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.i;
        return spinnerPopup != null ? spinnerPopup.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.i != null ? this.j : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final SpinnerPopup getInternalPopup() {
        return this.i;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.i;
        return spinnerPopup != null ? spinnerPopup.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.i;
        return spinnerPopup != null ? spinnerPopup.m() : super.getPrompt();
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup == null || !spinnerPopup.b()) {
            return;
        }
        spinnerPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.i == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (!appCompatSpinner.getInternalPopup().b()) {
                    appCompatSpinner.i.f(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver2 = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.i;
        savedState.d = spinnerPopup != null && spinnerPopup.b();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.b()) {
            return true;
        }
        spinnerPopup.f(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            spinnerPopup.e(i);
            spinnerPopup.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup != null) {
            spinnerPopup.d(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.i != null) {
            this.j = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup != null) {
            spinnerPopup.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(AppCompatResources.b(i, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup != null) {
            spinnerPopup.n(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.h) {
            this.g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        SpinnerPopup spinnerPopup = this.i;
        if (spinnerPopup != null) {
            Context context = this.e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            DropDownAdapter dropDownAdapter = new DropDownAdapter();
            dropDownAdapter.d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dropDownAdapter.e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    Api23Impl.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.b();
                    }
                }
            }
            spinnerPopup.o(dropDownAdapter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.k = r0
            android.content.Context r0 = r11.getContext()
            androidx.appcompat.widget.ThemeUtils.a(r11, r0)
            int[] r0 = androidx.appcompat.R.styleable.x
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.f(r12, r13, r0, r14, r1)
            android.content.res.TypedArray r3 = r2.b
            androidx.appcompat.widget.AppCompatBackgroundHelper r4 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r4.<init>(r11)
            r11.d = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L30
            androidx.appcompat.view.ContextThemeWrapper r5 = new androidx.appcompat.view.ContextThemeWrapper
            r5.<init>(r12, r4)
            r11.e = r5
            goto L32
        L30:
            r11.e = r12
        L32:
            r4 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.AppCompatSpinner.l     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r14, r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            if (r7 == 0) goto L4b
            int r4 = r6.getInt(r1, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            goto L4b
        L45:
            r12 = move-exception
            r5 = r6
            goto Lce
        L49:
            r7 = move-exception
            goto L54
        L4b:
            r6.recycle()
            goto L5e
        L4f:
            r12 = move-exception
            goto Lce
        L52:
            r7 = move-exception
            r6 = r5
        L54:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L5e
            goto L4b
        L5e:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L96
            if (r4 == r7) goto L65
            goto La3
        L65:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r4 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r8 = r11.e
            r4.<init>(r8, r13, r14)
            android.content.Context r8 = r11.e
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.f(r8, r13, r0, r14, r1)
            r8 = -2
            android.content.res.TypedArray r9 = r0.b
            r10 = 3
            int r8 = r9.getLayoutDimension(r10, r8)
            r11.j = r8
            android.graphics.drawable.Drawable r8 = r0.b(r7)
            r4.p(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.F = r6
            r0.g()
            r11.i = r4
            androidx.appcompat.widget.AppCompatSpinner$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$1
            r0.<init>(r11)
            r11.f = r0
            goto La3
        L96:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r0 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r0.<init>()
            r11.i = r0
            java.lang.String r4 = r3.getString(r6)
            r0.f = r4
        La3:
            java.lang.CharSequence[] r0 = r3.getTextArray(r1)
            if (r0 == 0) goto Lba
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r12, r3, r0)
            r12 = 2131559257(0x7f0d0359, float:1.8743853E38)
            r1.setDropDownViewResource(r12)
            r11.setAdapter(r1)
        Lba:
            r2.g()
            r11.h = r7
            android.widget.SpinnerAdapter r12 = r11.g
            if (r12 == 0) goto Lc8
            r11.setAdapter(r12)
            r11.g = r5
        Lc8:
            androidx.appcompat.widget.AppCompatBackgroundHelper r12 = r11.d
            r12.d(r13, r14)
            return
        Lce:
            if (r5 == 0) goto Ld3
            r5.recycle()
        Ld3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
