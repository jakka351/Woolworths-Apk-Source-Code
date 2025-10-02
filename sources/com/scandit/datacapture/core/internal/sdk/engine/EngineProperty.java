package com.scandit.datacapture.core.internal.sdk.engine;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "a", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "getNativeProperty", "()Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "nativeProperty", "", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getDescription", lqlqqlq.mmm006Dm006Dm, "Lcom/scandit/datacapture/core/internal/sdk/engine/NativePropertyType;", "getType", "()Lcom/scandit/datacapture/core/internal/sdk/engine/NativePropertyType;", "type", "DataBool", "DataFloat", "DataInt", "DataString", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataBool;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataFloat;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataInt;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataString;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class EngineProperty {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeProperty nativeProperty;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataBool;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "nativeProperty", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "(Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;)V", "defaultValue", "", "getDefaultValue", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataBool extends EngineProperty {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataBool(@NotNull NativeProperty nativeProperty) {
            super(nativeProperty, null);
            Intrinsics.h(nativeProperty, "nativeProperty");
        }

        public final boolean getDefaultValue() {
            return getNativeProperty().dataBool.defaultValue;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataFloat;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "nativeProperty", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "(Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;)V", "defaultValue", "", "getDefaultValue", "()F", "maxValue", "getMaxValue", "minValue", "getMinValue", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataFloat extends EngineProperty {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataFloat(@NotNull NativeProperty nativeProperty) {
            super(nativeProperty, null);
            Intrinsics.h(nativeProperty, "nativeProperty");
        }

        public final float getDefaultValue() {
            return getNativeProperty().dataFloat.defaultValue;
        }

        public final float getMaxValue() {
            return getNativeProperty().dataFloat.maxValue;
        }

        public final float getMinValue() {
            return getNativeProperty().dataFloat.minValue;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataInt;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "nativeProperty", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "(Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;)V", "defaultValue", "", "getDefaultValue", "()I", "maxValue", "getMaxValue", "minValue", "getMinValue", "step", "getStep", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataInt extends EngineProperty {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataInt(@NotNull NativeProperty nativeProperty) {
            super(nativeProperty, null);
            Intrinsics.h(nativeProperty, "nativeProperty");
        }

        public final int getDefaultValue() {
            return getNativeProperty().dataInt.defaultValue;
        }

        public final int getMaxValue() {
            return getNativeProperty().dataInt.maxValue;
        }

        public final int getMinValue() {
            return getNativeProperty().dataInt.minValue;
        }

        public final int getStep() {
            return getNativeProperty().dataInt.step;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty$DataString;", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "nativeProperty", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "(Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;)V", "defaultValue", "", "getDefaultValue", "()Ljava/lang/String;", "supportedValues", "", "getSupportedValues", "()Ljava/util/List;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataString extends EngineProperty {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataString(@NotNull NativeProperty nativeProperty) {
            super(nativeProperty, null);
            Intrinsics.h(nativeProperty, "nativeProperty");
        }

        @NotNull
        public final String getDefaultValue() {
            String str = getNativeProperty().dataString.defaultValue;
            Intrinsics.g(str, "nativeProperty.dataString.defaultValue");
            return str;
        }

        @NotNull
        public final List<String> getSupportedValues() {
            ArrayList<String> arrayList = getNativeProperty().dataString.supportedValues;
            Intrinsics.g(arrayList, "nativeProperty.dataString.supportedValues");
            return arrayList;
        }
    }

    public /* synthetic */ EngineProperty(NativeProperty nativeProperty, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProperty);
    }

    @NotNull
    public final String getDescription() {
        String str = this.nativeProperty.description;
        Intrinsics.g(str, "nativeProperty.description");
        return str;
    }

    @NotNull
    public final String getName() {
        String str = this.nativeProperty.name;
        Intrinsics.g(str, "nativeProperty.name");
        return str;
    }

    @NotNull
    public final NativeProperty getNativeProperty() {
        return this.nativeProperty;
    }

    @NotNull
    public final NativePropertyType getType() {
        NativePropertyType nativePropertyType = this.nativeProperty.type;
        Intrinsics.g(nativePropertyType, "nativeProperty.type");
        return nativePropertyType;
    }

    private EngineProperty(NativeProperty nativeProperty) {
        this.nativeProperty = nativeProperty;
    }
}
