package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    public static final Property U = new AnonymousClass1(Float.class, "thumbPos");
    public static final int[] V = {R.attr.state_checked};
    public final VelocityTracker A;
    public final int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public final TextPaint L;
    public final ColorStateList M;
    public StaticLayout N;
    public StaticLayout O;
    public final AllCapsTransformationMethod P;
    public ObjectAnimator Q;
    public AppCompatEmojiTextHelper R;
    public EmojiCompatInitCallback S;
    public final Rect T;
    public Drawable d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public boolean g;
    public boolean h;
    public Drawable i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public boolean v;
    public int w;
    public final int x;
    public float y;
    public float z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.C);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public static class EmojiCompatInitCallback extends EmojiCompat.InitCallback {
        public final WeakReference d;

        public EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.d = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.d.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.d.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f187a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f187a = propertyMapper.mapObject("textOff", R.attr.textOff);
            this.b = propertyMapper.mapObject("textOn", R.attr.textOn);
            this.c = propertyMapper.mapObject("thumb", R.attr.thumb);
            this.d = propertyMapper.mapBoolean("showText", com.woolworths.R.attr.showText);
            this.e = propertyMapper.mapBoolean("splitTrack", com.woolworths.R.attr.splitTrack);
            this.f = propertyMapper.mapInt("switchMinWidth", com.woolworths.R.attr.switchMinWidth);
            this.g = propertyMapper.mapInt("switchPadding", com.woolworths.R.attr.switchPadding);
            this.h = propertyMapper.mapInt("thumbTextPadding", com.woolworths.R.attr.thumbTextPadding);
            this.i = propertyMapper.mapObject("thumbTint", com.woolworths.R.attr.thumbTint);
            this.j = propertyMapper.mapObject("thumbTintMode", com.woolworths.R.attr.thumbTintMode);
            this.k = propertyMapper.mapObject("track", com.woolworths.R.attr.track);
            this.l = propertyMapper.mapObject("trackTint", com.woolworths.R.attr.trackTint);
            this.m = propertyMapper.mapObject("trackTintMode", com.woolworths.R.attr.trackTintMode);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            SwitchCompat switchCompat = (SwitchCompat) obj;
            propertyReader.readObject(this.f187a, switchCompat.getTextOff());
            propertyReader.readObject(this.b, switchCompat.getTextOn());
            propertyReader.readObject(this.c, switchCompat.getThumbDrawable());
            propertyReader.readBoolean(this.d, switchCompat.getShowText());
            propertyReader.readBoolean(this.e, switchCompat.getSplitTrack());
            propertyReader.readInt(this.f, switchCompat.getSwitchMinWidth());
            propertyReader.readInt(this.g, switchCompat.getSwitchPadding());
            propertyReader.readInt(this.h, switchCompat.getThumbTextPadding());
            propertyReader.readObject(this.i, switchCompat.getThumbTintList());
            propertyReader.readObject(this.j, switchCompat.getThumbTintMode());
            propertyReader.readObject(this.k, switchCompat.getTrackDrawable());
            propertyReader.readObject(this.l, switchCompat.getTrackTintList());
            propertyReader.readObject(this.m, switchCompat.getTrackTintMode());
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new AppCompatEmojiTextHelper(this);
        }
        return this.R;
    }

    private boolean getTargetCheckedState() {
        return this.C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.C : this.C) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.d;
        Rect rectB = drawable2 != null ? DrawableUtils.b(drawable2) : DrawableUtils.c;
        return ((((this.D - this.F) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.t = charSequence;
        AppCompatEmojiTextHelper emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.e(this.P);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.u = charSequence;
        this.O = null;
        if (this.v) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.r = charSequence;
        AppCompatEmojiTextHelper emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.e(this.P);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.s = charSequence;
        this.N = null;
        if (this.v) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.g || this.h) {
                Drawable drawableMutate = drawable.mutate();
                this.d = drawableMutate;
                if (this.g) {
                    drawableMutate.setTintList(this.e);
                }
                if (this.h) {
                    this.d.setTintMode(this.f);
                }
                if (this.d.isStateful()) {
                    this.d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.i;
        if (drawable != null) {
            if (this.l || this.m) {
                Drawable drawableMutate = drawable.mutate();
                this.i = drawableMutate;
                if (this.l) {
                    drawableMutate.setTintList(this.j);
                }
                if (this.m) {
                    this.i.setTintMode(this.k);
                }
                if (this.i.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.r);
        setTextOffInternal(this.t);
        requestLayout();
    }

    public final void d() {
        if (this.S == null && this.R.b.b() && EmojiCompat.g()) {
            EmojiCompat emojiCompatA = EmojiCompat.a();
            int iD = emojiCompatA.d();
            if (iD == 3 || iD == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.S = emojiCompatInitCallback;
                emojiCompatA.k(emojiCompatInitCallback);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.d;
        Rect rectB = drawable != null ? DrawableUtils.b(drawable) : DrawableUtils.c;
        Drawable drawable2 = this.i;
        Rect rect = this.T;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.i.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.F + rect.right;
            this.d.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.i;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.p : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.d(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.v;
    }

    public boolean getSplitTrack() {
        return this.q;
    }

    public int getSwitchMinWidth() {
        return this.o;
    }

    public int getSwitchPadding() {
        return this.p;
    }

    public CharSequence getTextOff() {
        return this.t;
    }

    public CharSequence getTextOn() {
        return this.r;
    }

    public Drawable getThumbDrawable() {
        return this.d;
    }

    @FloatRange
    public final float getThumbPosition() {
        return this.C;
    }

    public int getThumbTextPadding() {
        return this.n;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.e;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f;
    }

    public Drawable getTrackDrawable() {
        return this.i;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.j;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.Q;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.Q.end();
        this.Q = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.i;
        Rect rect = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.d;
        if (drawable != null) {
            if (!this.q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = DrawableUtils.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.N : this.O;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.L;
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.r : this.t;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.d != null) {
            Drawable drawable = this.i;
            Rect rect = this.T;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = DrawableUtils.b(this.d);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.D) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.E;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.E + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.E;
        }
        this.G = paddingLeft;
        this.H = paddingTop;
        this.J = height;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.v) {
            StaticLayout staticLayout = this.N;
            TextPaint textPaint = this.L;
            if (staticLayout == null) {
                CharSequence charSequence = this.s;
                this.N = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
            if (this.O == null) {
                CharSequence charSequence2 = this.u;
                this.O = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
        }
        Drawable drawable = this.d;
        Rect rect = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.F = Math.max(this.v ? (this.n * 2) + Math.max(this.N.getWidth(), this.O.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            Rect rectB = DrawableUtils.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.K ? Math.max(this.o, (this.F * 2) + iMax + iMax2) : this.o;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.D = iMax3;
        this.E = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r : this.t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.r;
                if (string == null) {
                    string = getResources().getString(com.woolworths.R.string.abc_capital_on);
                }
                ViewCompat.M(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.t;
            if (string2 == null) {
                string2 = getResources().getString(com.woolworths.R.string.abc_capital_off);
            }
            ViewCompat.M(this, string2);
        }
        IBinder windowToken = getWindowToken();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.Q;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (zIsChecked) {
                f = 1.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (zIsChecked) {
            f = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) U, f);
        this.Q = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.Q.setAutoCancel(true);
        this.Q.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
        setTextOnInternal(this.r);
        setTextOffInternal(this.t);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.K = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().b.a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.v != z) {
            this.v = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.p = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.t;
        if (string == null) {
            string = getResources().getString(com.woolworths.R.string.abc_capital_off);
        }
        ViewCompat.M(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.r;
        if (string == null) {
            string = getResources().getString(com.woolworths.R.string.abc_capital_on);
        }
        ViewCompat.M(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setThumbTextPadding(int i) {
        this.n = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.e = colorStateList;
        this.g = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f = mode;
        this.h = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.j = colorStateList;
        this.l = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.k = mode;
        this.m = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d || drawable == this.i;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.A = VelocityTracker.obtain();
        this.K = true;
        this.T = new Rect();
        ThemeUtils.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = androidx.appcompat.R.styleable.y;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        ViewCompat.z(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableB = tintTypedArrayF.b(2);
        this.d = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = tintTypedArrayF.b(11);
        this.i = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.v = typedArray.getBoolean(3, true);
        this.n = typedArray.getDimensionPixelSize(8, 0);
        this.o = typedArray.getDimensionPixelSize(5, 0);
        this.p = typedArray.getDimensionPixelSize(6, 0);
        this.q = typedArray.getBoolean(4, false);
        ColorStateList colorStateListA = tintTypedArrayF.a(9);
        if (colorStateListA != null) {
            this.e = colorStateListA;
            this.g = true;
        }
        PorterDuff.Mode modeC = DrawableUtils.c(typedArray.getInt(10, -1), null);
        if (this.f != modeC) {
            this.f = modeC;
            this.h = true;
        }
        if (this.g || this.h) {
            a();
        }
        ColorStateList colorStateListA2 = tintTypedArrayF.a(12);
        if (colorStateListA2 != null) {
            this.j = colorStateListA2;
            this.l = true;
        }
        PorterDuff.Mode modeC2 = DrawableUtils.c(typedArray.getInt(13, -1), null);
        if (this.k != modeC2) {
            this.k = modeC2;
            this.m = true;
        }
        if (this.l || this.m) {
            b();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, androidx.appcompat.R.styleable.z);
            TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
            ColorStateList colorStateListA3 = tintTypedArray.a(3);
            if (colorStateListA3 != null) {
                this.M = colorStateListA3;
            } else {
                this.M = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i3 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(i3);
                } else {
                    typefaceCreate = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(typefaceCreate);
                int i4 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                this.P = new AllCapsTransformationMethod(getContext());
            } else {
                this.P = null;
            }
            setTextOnInternal(this.r);
            setTextOffInternal(this.t);
            tintTypedArray.g();
        }
        new AppCompatTextHelper(this).f(attributeSet, i);
        tintTypedArrayF.g();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.x = viewConfiguration.getScaledTouchSlop();
        this.B = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
