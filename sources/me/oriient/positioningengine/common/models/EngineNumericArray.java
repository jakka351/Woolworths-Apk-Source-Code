package me.oriient.positioningengine.common.models;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0017¨\u0006#"}, d2 = {"Lme/oriient/positioningengine/common/models/EngineNumericArray;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Ljava/io/Serializable;", "", "data", "", "sizePerDimension", "<init>", "([D[I)V", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()[D", "component2", "()[I", "copy", "([D[I)Lme/oriient/positioningengine/common/models/EngineNumericArray;", "", "toString", "()Ljava/lang/String;", "[D", "getData", "[I", "getSizePerDimension", "Companion", "me/oriient/positioningengine/common/models/c", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class EngineNumericArray implements Jsonable, Serializable {

    @NotNull
    public static final c Companion = new c();
    private static final long serialVersionUID = 1;

    @NotNull
    private final double[] data;

    @NotNull
    private final int[] sizePerDimension;

    public EngineNumericArray(@NotNull double[] data, @NotNull int[] sizePerDimension) {
        Intrinsics.h(data, "data");
        Intrinsics.h(sizePerDimension, "sizePerDimension");
        this.data = data;
        this.sizePerDimension = sizePerDimension;
    }

    public static /* synthetic */ EngineNumericArray copy$default(EngineNumericArray engineNumericArray, double[] dArr, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            dArr = engineNumericArray.data;
        }
        if ((i & 2) != 0) {
            iArr = engineNumericArray.sizePerDimension;
        }
        return engineNumericArray.copy(dArr, iArr);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final double[] getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final int[] getSizePerDimension() {
        return this.sizePerDimension;
    }

    @NotNull
    public final EngineNumericArray copy(@NotNull double[] data, @NotNull int[] sizePerDimension) {
        Intrinsics.h(data, "data");
        Intrinsics.h(sizePerDimension, "sizePerDimension");
        return new EngineNumericArray(data, sizePerDimension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!EngineNumericArray.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type me.oriient.positioningengine.common.models.EngineNumericArray");
        EngineNumericArray engineNumericArray = (EngineNumericArray) other;
        return Arrays.equals(this.data, engineNumericArray.data) && Arrays.equals(this.sizePerDimension, engineNumericArray.sizePerDimension);
    }

    @NotNull
    public final double[] getData() {
        return this.data;
    }

    @NotNull
    public final int[] getSizePerDimension() {
        return this.sizePerDimension;
    }

    public int hashCode() {
        return Arrays.hashCode(this.sizePerDimension) + (Arrays.hashCode(this.data) * 31);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        int[] iArr = this.sizePerDimension;
        if (iArr.length <= 1) {
            return JsonHelpersKt.toJsonableArray(this.data).toJsonElement();
        }
        if (iArr.length > 2) {
            HashMap map = new HashMap();
            map.put("ArrayType", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString("double")));
            map.put("ArraySize", JsonHelpersKt.toJsonableArray(this.sizePerDimension));
            map.put("ArrayData", JsonHelpersKt.toJsonableArray(this.data));
            return JsonHelpersKt.toJsonableMap(map).toJsonElement();
        }
        if (iArr[0] == 1) {
            return JsonHelpersKt.toJsonableArray(this.data).toJsonElement();
        }
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = this.sizePerDimension;
        int i = iArr2[0];
        int i2 = iArr2[1];
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(Double.valueOf(this.data[(i3 * i2) + i4]));
            }
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(JsonHelpersKt.toDoubleJsonableArray((List) it.next()));
        }
        return JsonHelpersKt.toJsonableArray(arrayList3).toJsonElement();
    }

    @NotNull
    public String toString() {
        return "EngineNumericArray(data=" + Arrays.toString(this.data) + ", sizePerDimension=" + Arrays.toString(this.sizePerDimension) + ')';
    }
}
