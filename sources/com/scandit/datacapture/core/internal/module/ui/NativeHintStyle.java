package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MarginsF;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeHintStyle {

    @DjinniGenerated
    public static final class CppProxy extends NativeHintStyle {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18609a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native Anchor native_getAnchor(long j);

        private native NativeColor native_getBackgroundColor(long j);

        private native float native_getCornerRadius(long j);

        private native boolean native_getFitToText(long j);

        private native NativeHintFont native_getFont(long j);

        private native NativeHintAnchor native_getHintAnchor(long j);

        private native float native_getHintAnchorOffset(long j);

        private native NativeHintCornerStyle native_getHintCornerStyle(long j);

        private native NativeHintHeight native_getHintHeight(long j);

        private native NativeHintIcon native_getHintIcon(long j);

        private native NativeHintWidth native_getHintWidth(long j);

        private native float native_getHorizontalMargin(long j);

        private native NativeColor native_getIconColor(long j);

        private native float native_getLineHeight(long j);

        private native int native_getMaxLines(long j);

        private native float native_getMaxWidthFraction(long j);

        private native MarginsF native_getPadding(long j);

        private native NativeHintAlignment native_getTextAlignment(long j);

        private native NativeColor native_getTextColor(long j);

        private native float native_getTextSize(long j);

        private native int native_getTextWeight(long j);

        private native float native_getVerticalOffsetRatio(long j);

        private native boolean native_isAnimatedIntoView(long j);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public Anchor getAnchor() {
            return native_getAnchor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getBackgroundColor() {
            return native_getBackgroundColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getCornerRadius() {
            return native_getCornerRadius(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public boolean getFitToText() {
            return native_getFitToText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintFont getFont() {
            return native_getFont(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintAnchor getHintAnchor() {
            return native_getHintAnchor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getHintAnchorOffset() {
            return native_getHintAnchorOffset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintCornerStyle getHintCornerStyle() {
            return native_getHintCornerStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintHeight getHintHeight() {
            return native_getHintHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintIcon getHintIcon() {
            return native_getHintIcon(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintWidth getHintWidth() {
            return native_getHintWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getHorizontalMargin() {
            return native_getHorizontalMargin(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getIconColor() {
            return native_getIconColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getLineHeight() {
            return native_getLineHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public int getMaxLines() {
            return native_getMaxLines(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getMaxWidthFraction() {
            return native_getMaxWidthFraction(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public MarginsF getPadding() {
            return native_getPadding(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintAlignment getTextAlignment() {
            return native_getTextAlignment(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getTextColor() {
            return native_getTextColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getTextSize() {
            return native_getTextSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public int getTextWeight() {
            return native_getTextWeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getVerticalOffsetRatio() {
            return native_getVerticalOffsetRatio(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public boolean isAnimatedIntoView() {
            return native_isAnimatedIntoView(this.nativeRef);
        }
    }

    public abstract Anchor getAnchor();

    public abstract NativeColor getBackgroundColor();

    public abstract float getCornerRadius();

    public abstract boolean getFitToText();

    public abstract NativeHintFont getFont();

    public abstract NativeHintAnchor getHintAnchor();

    public abstract float getHintAnchorOffset();

    public abstract NativeHintCornerStyle getHintCornerStyle();

    public abstract NativeHintHeight getHintHeight();

    public abstract NativeHintIcon getHintIcon();

    public abstract NativeHintWidth getHintWidth();

    public abstract float getHorizontalMargin();

    public abstract NativeColor getIconColor();

    public abstract float getLineHeight();

    public abstract int getMaxLines();

    public abstract float getMaxWidthFraction();

    public abstract MarginsF getPadding();

    public abstract NativeHintAlignment getTextAlignment();

    public abstract NativeColor getTextColor();

    public abstract float getTextSize();

    public abstract int getTextWeight();

    public abstract float getVerticalOffsetRatio();

    public abstract boolean isAnimatedIntoView();
}
