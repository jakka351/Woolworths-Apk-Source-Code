package me.oriient.ui.contentview.models;

import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH'¨\u0006\u000b"}, d2 = {"Lme/oriient/ui/contentview/models/ContentColor;", "", "()V", "applyToPaint", "", "paint", "Landroid/graphics/Paint;", "toAndroidColorInt", "", "Int", "Shader", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ContentColor {

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lme/oriient/ui/contentview/models/ContentColor$Int;", "Lme/oriient/ui/contentview/models/ContentColor;", "color", "", "(I)V", "applyToPaint", "", "paint", "Landroid/graphics/Paint;", "toAndroidColorInt", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Int extends ContentColor {
        private final int color;

        public Int(@ColorInt int i) {
            this.color = i;
        }

        @Override // me.oriient.ui.contentview.models.ContentColor
        public void applyToPaint(@NotNull Paint paint) {
            Intrinsics.h(paint, "paint");
            paint.setColor(this.color);
        }

        @Override // me.oriient.ui.contentview.models.ContentColor
        /* renamed from: toAndroidColorInt, reason: from getter */
        public int getColor() {
            return this.color;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lme/oriient/ui/contentview/models/ContentColor$Shader;", "Lme/oriient/ui/contentview/models/ContentColor;", "shader", "Landroid/graphics/Shader;", "(Landroid/graphics/Shader;)V", "applyToPaint", "", "paint", "Landroid/graphics/Paint;", "toAndroidColorInt", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Shader extends ContentColor {

        @NotNull
        private final android.graphics.Shader shader;

        public Shader(@NotNull android.graphics.Shader shader) {
            Intrinsics.h(shader, "shader");
            this.shader = shader;
        }

        @Override // me.oriient.ui.contentview.models.ContentColor
        public void applyToPaint(@NotNull Paint paint) {
            Intrinsics.h(paint, "paint");
            paint.setShader(this.shader);
        }

        @Override // me.oriient.ui.contentview.models.ContentColor
        /* renamed from: toAndroidColorInt */
        public int getColor() {
            return -1;
        }
    }

    public abstract void applyToPaint(@NotNull Paint paint);

    @ColorInt
    /* renamed from: toAndroidColorInt */
    public abstract int getColor();
}
