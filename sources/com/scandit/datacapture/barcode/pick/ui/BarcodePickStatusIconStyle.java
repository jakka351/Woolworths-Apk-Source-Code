package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.ColorInt;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "", "toJson", "Companion", "BarcodePickStatusIconStyleWithColors", "BarcodePickStatusIconStyleWithIcon", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithColors;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithIcon;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class BarcodePickStatusIconStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithColors;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "toJson", "", "component1", "component2", "component3", "iconColor", "iconBackgroundColor", TextBundle.TEXT_ENTRY, "copy", "toString", "hashCode", "", "other", "", "equals", "a", "I", "getIconColor", "()I", "b", "getIconBackgroundColor", "c", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BarcodePickStatusIconStyleWithColors extends BarcodePickStatusIconStyle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconColor;

        /* renamed from: b, reason: from kotlin metadata */
        private final int iconBackgroundColor;

        /* renamed from: c, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodePickStatusIconStyleWithColors(@ColorInt int i, @ColorInt int i2, @NotNull String text) {
            super(null);
            Intrinsics.h(text, "text");
            this.iconColor = i;
            this.iconBackgroundColor = i2;
            this.text = text;
        }

        public static /* synthetic */ BarcodePickStatusIconStyleWithColors copy$default(BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = barcodePickStatusIconStyleWithColors.iconColor;
            }
            if ((i3 & 2) != 0) {
                i2 = barcodePickStatusIconStyleWithColors.iconBackgroundColor;
            }
            if ((i3 & 4) != 0) {
                str = barcodePickStatusIconStyleWithColors.text;
            }
            return barcodePickStatusIconStyleWithColors.copy(i, i2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final BarcodePickStatusIconStyleWithColors copy(@ColorInt int iconColor, @ColorInt int iconBackgroundColor, @NotNull String text) {
            Intrinsics.h(text, "text");
            return new BarcodePickStatusIconStyleWithColors(iconColor, iconBackgroundColor, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodePickStatusIconStyleWithColors)) {
                return false;
            }
            BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors = (BarcodePickStatusIconStyleWithColors) other;
            return this.iconColor == barcodePickStatusIconStyleWithColors.iconColor && this.iconBackgroundColor == barcodePickStatusIconStyleWithColors.iconBackgroundColor && Intrinsics.c(this.text, barcodePickStatusIconStyleWithColors.text);
        }

        public final int getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        public final int getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + androidx.camera.core.impl.b.a(this.iconBackgroundColor, Integer.hashCode(this.iconColor) * 31, 31);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle
        @NotNull
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "colors");
            jSONObject.put(TextBundle.TEXT_ENTRY, this.text);
            jSONObject.put("iconColor", this.iconColor);
            jSONObject.put("iconBackgroundColor", this.iconBackgroundColor);
            String string = jSONObject.toString();
            Intrinsics.g(string, "JSONObject().apply {\n   …lor)\n        }.toString()");
            return string;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("BarcodePickStatusIconStyleWithColors(iconColor=");
            sb.append(this.iconColor);
            sb.append(", iconBackgroundColor=");
            sb.append(this.iconBackgroundColor);
            sb.append(", text=");
            return androidx.camera.core.impl.b.r(sb, this.text, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithIcon;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "toJson", "Landroid/graphics/Bitmap;", "component1", "component2", BarcodePickDeserializer.FIELD_ICON, TextBundle.TEXT_ENTRY, "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Landroid/graphics/Bitmap;", "getIcon", "()Landroid/graphics/Bitmap;", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BarcodePickStatusIconStyleWithIcon extends BarcodePickStatusIconStyle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap icon;

        /* renamed from: b, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodePickStatusIconStyleWithIcon(@NotNull Bitmap icon, @NotNull String text) {
            super(null);
            Intrinsics.h(icon, "icon");
            Intrinsics.h(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public static /* synthetic */ BarcodePickStatusIconStyleWithIcon copy$default(BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon, Bitmap bitmap, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = barcodePickStatusIconStyleWithIcon.icon;
            }
            if ((i & 2) != 0) {
                str = barcodePickStatusIconStyleWithIcon.text;
            }
            return barcodePickStatusIconStyleWithIcon.copy(bitmap, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Bitmap getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final BarcodePickStatusIconStyleWithIcon copy(@NotNull Bitmap icon, @NotNull String text) {
            Intrinsics.h(icon, "icon");
            Intrinsics.h(text, "text");
            return new BarcodePickStatusIconStyleWithIcon(icon, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodePickStatusIconStyleWithIcon)) {
                return false;
            }
            BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon = (BarcodePickStatusIconStyleWithIcon) other;
            return Intrinsics.c(this.icon, barcodePickStatusIconStyleWithIcon.icon) && Intrinsics.c(this.text, barcodePickStatusIconStyleWithIcon.text);
        }

        @NotNull
        public final Bitmap getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle
        @NotNull
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", BarcodePickDeserializer.FIELD_ICON);
            jSONObject.put(TextBundle.TEXT_ENTRY, this.text);
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, BitmapExtensionsKt.toBase64(this.icon));
            String string = jSONObject.toString();
            Intrinsics.g(string, "JSONObject().apply {\n   …4())\n        }.toString()");
            return string;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("BarcodePickStatusIconStyleWithIcon(icon=");
            sb.append(this.icon);
            sb.append(", text=");
            return androidx.camera.core.impl.b.r(sb, this.text, ')');
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "fromJson", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, TextBundle.TEXT_ENTRY, "withIcon", "", "iconColor", "iconBackgroundColor", "withColors", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodePickStatusIconStyle fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            JsonValue jsonValue = new JsonValue(jsonData);
            String strRequireByKeyAsString = jsonValue.requireByKeyAsString("type");
            String strRequireByKeyAsString2 = jsonValue.requireByKeyAsString(TextBundle.TEXT_ENTRY);
            if (Intrinsics.c(strRequireByKeyAsString, BarcodePickDeserializer.FIELD_ICON)) {
                Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(jsonValue.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON));
                if (bitmapBitmapFromBase64 == null) {
                    bitmapBitmapFromBase64 = BitmapFactory.decodeResource(AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources(), R.drawable.sc_pick_status_icon_default);
                    Intrinsics.g(bitmapBitmapFromBase64, "decodeResource(\n        …s_icon_default,\n        )");
                }
                return withIcon(bitmapBitmapFromBase64, strRequireByKeyAsString2);
            }
            if (Intrinsics.c(strRequireByKeyAsString, "colors")) {
                return withColors(jsonValue.requireByKeyAsInt("iconColor"), jsonValue.requireByKeyAsInt("iconBackgroundColor"), strRequireByKeyAsString2);
            }
            throw new IllegalStateException((strRequireByKeyAsString + " is not a valid BarcodePickStatusIconStyle type").toString());
        }

        @JvmStatic
        @NotNull
        public final BarcodePickStatusIconStyle withColors(int iconColor, int iconBackgroundColor, @NotNull String text) {
            Intrinsics.h(text, "text");
            return new BarcodePickStatusIconStyleWithColors(iconColor, iconBackgroundColor, text);
        }

        @JvmStatic
        @NotNull
        public final BarcodePickStatusIconStyle withIcon(@NotNull Bitmap icon, @NotNull String text) {
            Intrinsics.h(icon, "icon");
            Intrinsics.h(text, "text");
            return new BarcodePickStatusIconStyleWithIcon(icon, text);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodePickStatusIconStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickStatusIconStyle fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickStatusIconStyle withColors(int i, int i2, @NotNull String str) {
        return INSTANCE.withColors(i, i2, str);
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickStatusIconStyle withIcon(@NotNull Bitmap bitmap, @NotNull String str) {
        return INSTANCE.withIcon(bitmap, str);
    }

    @NotNull
    public abstract String toJson();

    private BarcodePickStatusIconStyle() {
    }
}
