package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import com.scandit.datacapture.barcode.AbstractC0548c4;
import com.scandit.datacapture.barcode.C0742n2;
import com.scandit.datacapture.barcode.F8;
import com.scandit.datacapture.barcode.G8;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B3\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u0010.B;\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010/\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010/\u0012\b\u0010\u0016\u001a\u0004\u0018\u000100\u0012\b\u0010\u0017\u001a\u0004\u0018\u000100\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u00101B;\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010/\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010/\u0012\b\b\u0001\u00102\u001a\u00020\u001b\u0012\b\b\u0001\u00103\u001a\u00020\u001b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u00104B'\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010/\u0012\b\u0010\u0016\u001a\u0004\u0018\u000100\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u00105B'\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010/\u0012\b\b\u0001\u00102\u001a\u00020\u001b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u00106J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\fR\u001a\u0010\u0017\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012¨\u00068"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "", "", "toJson", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "component1$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "component1", "component2$scandit_barcode_capture", "component2", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", "component3$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", "component3", "component4$scandit_barcode_capture", "component4", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "component5$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "component5", "brush", "selectedBrush", BarcodePickDeserializer.FIELD_ICON, "selectedIcon", "statusIconStyle", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "getBrush$scandit_barcode_capture", "b", "getSelectedBrush$scandit_barcode_capture", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", "getIcon$scandit_barcode_capture", "d", "getSelectedIcon$scandit_barcode_capture", "e", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "getStatusIconStyle$scandit_barcode_capture", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "Lcom/scandit/datacapture/core/ui/style/Brush;", "Landroid/graphics/Bitmap;", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/style/Brush;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "iconResource", "selectedIconResource", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/style/Brush;IILcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "(Lcom/scandit/datacapture/core/ui/style/Brush;Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "(Lcom/scandit/datacapture/core/ui/style/Brush;ILcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodePickViewHighlightStyleResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickBrush brush;

    /* renamed from: b, reason: from kotlin metadata */
    private final BarcodePickBrush selectedBrush;

    /* renamed from: c, reason: from kotlin metadata */
    private final BarcodePickIcon icon;

    /* renamed from: d, reason: from kotlin metadata */
    private final BarcodePickIcon selectedIcon;

    /* renamed from: e, reason: from kotlin metadata */
    private final BarcodePickStatusIconStyle statusIconStyle;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodePickViewHighlightStyleResponse fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            JsonValue jsonValue = new JsonValue(jsonData);
            JsonValue byKeyAsObject = jsonValue.getByKeyAsObject("brush", null);
            Brush brushFromJson = byKeyAsObject != null ? BrushDeserializer.fromJson(byKeyAsObject.jsonString()) : null;
            JsonValue byKeyAsObject2 = jsonValue.getByKeyAsObject("selectedBrush", null);
            Brush brushFromJson2 = byKeyAsObject2 != null ? BrushDeserializer.fromJson(byKeyAsObject2.jsonString()) : null;
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(jsonValue.getByKeyAsString(BarcodePickDeserializer.FIELD_ICON, ""));
            Bitmap bitmapBitmapFromBase642 = BitmapExtensionsKt.bitmapFromBase64(jsonValue.getByKeyAsString("selectedIcon", ""));
            JsonValue byKeyAsObject3 = jsonValue.getByKeyAsObject("statusIconStyle", null);
            return new BarcodePickViewHighlightStyleResponse(brushFromJson, brushFromJson2, bitmapBitmapFromBase64, bitmapBitmapFromBase642, byKeyAsObject3 != null ? BarcodePickStatusIconStyle.INSTANCE.fromJson(byKeyAsObject3.jsonString()) : null);
        }

        private Companion() {
        }
    }

    public BarcodePickViewHighlightStyleResponse(@NotNull BarcodePickBrush brush, @NotNull BarcodePickBrush selectedBrush, @NotNull BarcodePickIcon icon, @NotNull BarcodePickIcon selectedIcon, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        Intrinsics.h(brush, "brush");
        Intrinsics.h(selectedBrush, "selectedBrush");
        Intrinsics.h(icon, "icon");
        Intrinsics.h(selectedIcon, "selectedIcon");
        this.brush = brush;
        this.selectedBrush = selectedBrush;
        this.icon = icon;
        this.selectedIcon = selectedIcon;
        this.statusIconStyle = barcodePickStatusIconStyle;
    }

    public static /* synthetic */ BarcodePickViewHighlightStyleResponse copy$default(BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse, BarcodePickBrush barcodePickBrush, BarcodePickBrush barcodePickBrush2, BarcodePickIcon barcodePickIcon, BarcodePickIcon barcodePickIcon2, BarcodePickStatusIconStyle barcodePickStatusIconStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            barcodePickBrush = barcodePickViewHighlightStyleResponse.brush;
        }
        if ((i & 2) != 0) {
            barcodePickBrush2 = barcodePickViewHighlightStyleResponse.selectedBrush;
        }
        if ((i & 4) != 0) {
            barcodePickIcon = barcodePickViewHighlightStyleResponse.icon;
        }
        if ((i & 8) != 0) {
            barcodePickIcon2 = barcodePickViewHighlightStyleResponse.selectedIcon;
        }
        if ((i & 16) != 0) {
            barcodePickStatusIconStyle = barcodePickViewHighlightStyleResponse.statusIconStyle;
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyle2 = barcodePickStatusIconStyle;
        BarcodePickIcon barcodePickIcon3 = barcodePickIcon;
        return barcodePickViewHighlightStyleResponse.copy(barcodePickBrush, barcodePickBrush2, barcodePickIcon3, barcodePickIcon2, barcodePickStatusIconStyle2);
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickViewHighlightStyleResponse fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @NotNull
    /* renamed from: component1$scandit_barcode_capture, reason: from getter */
    public final BarcodePickBrush getBrush() {
        return this.brush;
    }

    @NotNull
    /* renamed from: component2$scandit_barcode_capture, reason: from getter */
    public final BarcodePickBrush getSelectedBrush() {
        return this.selectedBrush;
    }

    @NotNull
    /* renamed from: component3$scandit_barcode_capture, reason: from getter */
    public final BarcodePickIcon getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component4$scandit_barcode_capture, reason: from getter */
    public final BarcodePickIcon getSelectedIcon() {
        return this.selectedIcon;
    }

    @Nullable
    /* renamed from: component5$scandit_barcode_capture, reason: from getter */
    public final BarcodePickStatusIconStyle getStatusIconStyle() {
        return this.statusIconStyle;
    }

    @NotNull
    public final BarcodePickViewHighlightStyleResponse copy(@NotNull BarcodePickBrush brush, @NotNull BarcodePickBrush selectedBrush, @NotNull BarcodePickIcon icon, @NotNull BarcodePickIcon selectedIcon, @Nullable BarcodePickStatusIconStyle statusIconStyle) {
        Intrinsics.h(brush, "brush");
        Intrinsics.h(selectedBrush, "selectedBrush");
        Intrinsics.h(icon, "icon");
        Intrinsics.h(selectedIcon, "selectedIcon");
        return new BarcodePickViewHighlightStyleResponse(brush, selectedBrush, icon, selectedIcon, statusIconStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePickViewHighlightStyleResponse)) {
            return false;
        }
        BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse = (BarcodePickViewHighlightStyleResponse) other;
        return Intrinsics.c(this.brush, barcodePickViewHighlightStyleResponse.brush) && Intrinsics.c(this.selectedBrush, barcodePickViewHighlightStyleResponse.selectedBrush) && Intrinsics.c(this.icon, barcodePickViewHighlightStyleResponse.icon) && Intrinsics.c(this.selectedIcon, barcodePickViewHighlightStyleResponse.selectedIcon) && Intrinsics.c(this.statusIconStyle, barcodePickViewHighlightStyleResponse.statusIconStyle);
    }

    @NotNull
    public final BarcodePickBrush getBrush$scandit_barcode_capture() {
        return this.brush;
    }

    @NotNull
    public final BarcodePickIcon getIcon$scandit_barcode_capture() {
        return this.icon;
    }

    @NotNull
    public final BarcodePickBrush getSelectedBrush$scandit_barcode_capture() {
        return this.selectedBrush;
    }

    @NotNull
    public final BarcodePickIcon getSelectedIcon$scandit_barcode_capture() {
        return this.selectedIcon;
    }

    @Nullable
    public final BarcodePickStatusIconStyle getStatusIconStyle$scandit_barcode_capture() {
        return this.statusIconStyle;
    }

    public int hashCode() {
        int iHashCode = (this.selectedIcon.hashCode() + ((this.icon.hashCode() + ((this.selectedBrush.hashCode() + (this.brush.hashCode() * 31)) * 31)) * 31)) * 31;
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.statusIconStyle;
        return iHashCode + (barcodePickStatusIconStyle == null ? 0 : barcodePickStatusIconStyle.hashCode());
    }

    @NotNull
    public final String toJson() throws JSONException {
        String json;
        JSONObject jSONObject = new JSONObject();
        if (this.brush.asBrush() != null) {
            jSONObject.put("brush", new JSONObject(this.brush.toJson()));
        }
        if (this.selectedBrush.asBrush() != null) {
            jSONObject.put("selectedBrush", new JSONObject(this.selectedBrush.toJson()));
        }
        String json2 = this.icon.toJson();
        if (json2 != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, json2);
        }
        String json3 = this.selectedIcon.toJson();
        if (json3 != null) {
            jSONObject.put("selectedIcon", json3);
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.statusIconStyle;
        if (barcodePickStatusIconStyle != null && (json = barcodePickStatusIconStyle.toJson()) != null) {
            jSONObject.put("statusIconStyle", new JSONObject(json));
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …       }\n    }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "BarcodePickViewHighlightStyleResponse(brush=" + this.brush + ", selectedBrush=" + this.selectedBrush + ", icon=" + this.icon + ", selectedIcon=" + this.selectedIcon + ", statusIconStyle=" + this.statusIconStyle + ')';
    }

    public BarcodePickViewHighlightStyleResponse(@Nullable Brush brush, @Nullable Brush brush2, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(C0742n2.a(brush), C0742n2.a(brush2), AbstractC0548c4.a(bitmap, F8.b), AbstractC0548c4.a(bitmap2, G8.b), barcodePickStatusIconStyle);
    }

    public BarcodePickViewHighlightStyleResponse(@Nullable Brush brush, @Nullable Brush brush2, @DrawableRes int i, @DrawableRes int i2, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(C0742n2.a(brush), C0742n2.a(brush2), AbstractC0548c4.a(i, F8.b), AbstractC0548c4.a(i2, G8.b), barcodePickStatusIconStyle);
    }

    public BarcodePickViewHighlightStyleResponse(@Nullable Brush brush, @Nullable Bitmap bitmap, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(brush, (Brush) null, bitmap, (Bitmap) null, barcodePickStatusIconStyle);
    }

    public BarcodePickViewHighlightStyleResponse(@Nullable Brush brush, @DrawableRes int i, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(brush, (Brush) null, i, 0, barcodePickStatusIconStyle);
    }
}
