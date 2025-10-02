package com.scandit.datacapture.barcode.find.capture;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "", "", "component1", "component2", "Landroid/graphics/Bitmap;", "component3", "info", "additionalInfo", "image", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getInfo", "()Ljava/lang/String;", "b", "getAdditionalInfo", "c", "Landroid/graphics/Bitmap;", "getImage", "()Landroid/graphics/Bitmap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodeFindItemContent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String info;

    /* renamed from: b, reason: from kotlin metadata */
    private final String additionalInfo;

    /* renamed from: c, reason: from kotlin metadata */
    private final Bitmap image;

    public BarcodeFindItemContent(@Nullable String str, @Nullable String str2, @Nullable Bitmap bitmap) {
        this.info = str;
        this.additionalInfo = str2;
        this.image = bitmap;
    }

    public static /* synthetic */ BarcodeFindItemContent copy$default(BarcodeFindItemContent barcodeFindItemContent, String str, String str2, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = barcodeFindItemContent.info;
        }
        if ((i & 2) != 0) {
            str2 = barcodeFindItemContent.additionalInfo;
        }
        if ((i & 4) != 0) {
            bitmap = barcodeFindItemContent.image;
        }
        return barcodeFindItemContent.copy(str, str2, bitmap);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    public final BarcodeFindItemContent copy(@Nullable String info, @Nullable String additionalInfo, @Nullable Bitmap image) {
        return new BarcodeFindItemContent(info, additionalInfo, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeFindItemContent)) {
            return false;
        }
        BarcodeFindItemContent barcodeFindItemContent = (BarcodeFindItemContent) other;
        return Intrinsics.c(this.info, barcodeFindItemContent.info) && Intrinsics.c(this.additionalInfo, barcodeFindItemContent.additionalInfo) && Intrinsics.c(this.image, barcodeFindItemContent.image);
    }

    @Nullable
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        String str = this.info;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.additionalInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap = this.image;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarcodeFindItemContent(info=" + this.info + ", additionalInfo=" + this.additionalInfo + ", image=" + this.image + ')';
    }
}
