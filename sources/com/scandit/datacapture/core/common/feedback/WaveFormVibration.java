package com.scandit.datacapture.core.common.feedback;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/WaveFormVibration;", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "", "toJson", "", "other", "", "equals", "", "hashCode", "", "d", "[J", "getTimings", "()[J", "timings", "", "e", "[I", "getAmplitudes", "()[I", "amplitudes", "<init>", "([J[I)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class WaveFormVibration extends Vibration {

    /* renamed from: d, reason: from kotlin metadata */
    private final long[] timings;

    /* renamed from: e, reason: from kotlin metadata */
    private final int[] amplitudes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WaveFormVibration(@NotNull long[] timings) {
        this(timings, null, 2, 0 == true ? 1 : 0);
        Intrinsics.h(timings, "timings");
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveFormVibration)) {
            return false;
        }
        WaveFormVibration waveFormVibration = (WaveFormVibration) other;
        return Arrays.equals(this.timings, waveFormVibration.timings) && Arrays.equals(this.amplitudes, waveFormVibration.amplitudes);
    }

    @Nullable
    public final int[] getAmplitudes() {
        return this.amplitudes;
    }

    @NotNull
    public final long[] getTimings() {
        return this.timings;
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    public int hashCode() {
        int iHashCode = this.timings.hashCode() * 31;
        int[] iArr = this.amplitudes;
        return iHashCode + (iArr != null ? iArr.hashCode() : 0);
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    @NotNull
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "waveForm");
        jSONObject.put("timings", new JSONArray(this.timings));
        int[] iArr = this.amplitudes;
        if (iArr != null) {
            jSONObject.put("amplitudes", new JSONArray(iArr));
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …y(it)) }\n    }.toString()");
        return string;
    }

    public /* synthetic */ WaveFormVibration(long[] jArr, int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, (i & 2) != 0 ? null : iArr);
    }

    @JvmOverloads
    public WaveFormVibration(@NotNull long[] timings, @Nullable int[] iArr) {
        Intrinsics.h(timings, "timings");
        this.timings = timings;
        this.amplitudes = iArr;
    }
}
