package com.scandit.datacapture.barcode.find.ui;

import androidx.annotation.ColorInt;
import androidx.camera.core.impl.b;
import com.scandit.datacapture.barcode.AbstractC0618f6;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BE\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010+B1\b\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b*\u0010,J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJN\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\f¨\u0006."}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "", "", "toJson", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "inListItemColor", "notInListItemColor", "soundEnabled", "hapticEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "copy", "(IIZZZLjava/lang/Integer;)Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "toString", "hashCode", "other", "equals", "a", "I", "getInListItemColor", "()I", "b", "getNotInListItemColor", "c", "Z", "getSoundEnabled", "()Z", "d", "getHapticEnabled", "e", "getHardwareTriggerEnabled", "f", "Ljava/lang/Integer;", "getHardwareTriggerKeyCode", "<init>", "(IIZZZLjava/lang/Integer;)V", "(IIZZ)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodeFindViewSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int inListItemColor;

    /* renamed from: b, reason: from kotlin metadata */
    private final int notInListItemColor;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean soundEnabled;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean hapticEnabled;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean hardwareTriggerEnabled;

    /* renamed from: f, reason: from kotlin metadata */
    private final Integer hardwareTriggerKeyCode;

    public BarcodeFindViewSettings() {
        this(0, 0, false, false, false, null, 63, null);
    }

    public static /* synthetic */ BarcodeFindViewSettings copy$default(BarcodeFindViewSettings barcodeFindViewSettings, int i, int i2, boolean z, boolean z2, boolean z3, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = barcodeFindViewSettings.inListItemColor;
        }
        if ((i3 & 2) != 0) {
            i2 = barcodeFindViewSettings.notInListItemColor;
        }
        if ((i3 & 4) != 0) {
            z = barcodeFindViewSettings.soundEnabled;
        }
        if ((i3 & 8) != 0) {
            z2 = barcodeFindViewSettings.hapticEnabled;
        }
        if ((i3 & 16) != 0) {
            z3 = barcodeFindViewSettings.hardwareTriggerEnabled;
        }
        if ((i3 & 32) != 0) {
            num = barcodeFindViewSettings.hardwareTriggerKeyCode;
        }
        boolean z4 = z3;
        Integer num2 = num;
        return barcodeFindViewSettings.copy(i, i2, z, z2, z4, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInListItemColor() {
        return this.inListItemColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNotInListItemColor() {
        return this.notInListItemColor;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHardwareTriggerEnabled() {
        return this.hardwareTriggerEnabled;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getHardwareTriggerKeyCode() {
        return this.hardwareTriggerKeyCode;
    }

    @NotNull
    public final BarcodeFindViewSettings copy(@ColorInt int inListItemColor, @ColorInt int notInListItemColor, boolean soundEnabled, boolean hapticEnabled, boolean hardwareTriggerEnabled, @Nullable Integer hardwareTriggerKeyCode) {
        return new BarcodeFindViewSettings(inListItemColor, notInListItemColor, soundEnabled, hapticEnabled, hardwareTriggerEnabled, hardwareTriggerKeyCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeFindViewSettings)) {
            return false;
        }
        BarcodeFindViewSettings barcodeFindViewSettings = (BarcodeFindViewSettings) other;
        return this.inListItemColor == barcodeFindViewSettings.inListItemColor && this.notInListItemColor == barcodeFindViewSettings.notInListItemColor && this.soundEnabled == barcodeFindViewSettings.soundEnabled && this.hapticEnabled == barcodeFindViewSettings.hapticEnabled && this.hardwareTriggerEnabled == barcodeFindViewSettings.hardwareTriggerEnabled && Intrinsics.c(this.hardwareTriggerKeyCode, barcodeFindViewSettings.hardwareTriggerKeyCode);
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final boolean getHardwareTriggerEnabled() {
        return this.hardwareTriggerEnabled;
    }

    @Nullable
    public final Integer getHardwareTriggerKeyCode() {
        return this.hardwareTriggerKeyCode;
    }

    public final int getInListItemColor() {
        return this.inListItemColor;
    }

    public final int getNotInListItemColor() {
        return this.notInListItemColor;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iA = b.a(this.notInListItemColor, Integer.hashCode(this.inListItemColor) * 31, 31);
        boolean z = this.soundEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iA + i) * 31;
        boolean z2 = this.hapticEnabled;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.hardwareTriggerEnabled;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Integer num = this.hardwareTriggerKeyCode;
        return i5 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inListItemColor", AbstractC0618f6.a(this.inListItemColor));
        jSONObject.put("notInListItemColor", AbstractC0618f6.a(this.notInListItemColor));
        jSONObject.put("soundEnabled", this.soundEnabled);
        jSONObject.put("hapticEnabled", this.hapticEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, this.hardwareTriggerEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, this.hardwareTriggerKeyCode);
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …KeyCode)\n    }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "BarcodeFindViewSettings(inListItemColor=" + this.inListItemColor + ", notInListItemColor=" + this.notInListItemColor + ", soundEnabled=" + this.soundEnabled + ", hapticEnabled=" + this.hapticEnabled + ", hardwareTriggerEnabled=" + this.hardwareTriggerEnabled + ", hardwareTriggerKeyCode=" + this.hardwareTriggerKeyCode + ')';
    }

    public BarcodeFindViewSettings(@ColorInt int i, @ColorInt int i2, boolean z, boolean z2, boolean z3, @Nullable Integer num) {
        this.inListItemColor = i;
        this.notInListItemColor = i2;
        this.soundEnabled = z;
        this.hapticEnabled = z2;
        this.hardwareTriggerEnabled = z3;
        this.hardwareTriggerKeyCode = num;
    }

    public /* synthetic */ BarcodeFindViewSettings(int i, int i2, boolean z, boolean z2, boolean z3, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -13712946 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? null : num);
    }

    public /* synthetic */ BarcodeFindViewSettings(int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -13712946 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? true : z2);
    }

    public BarcodeFindViewSettings(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, z2, false, (Integer) null);
    }
}
