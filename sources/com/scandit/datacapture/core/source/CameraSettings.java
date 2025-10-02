package com.scandit.datacapture.core.source;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.D0;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2Deserializer;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeEdgeEnhancement;
import com.scandit.datacapture.core.internal.module.source.NativeFocusSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeNoiseReduction;
import com.scandit.datacapture.core.internal.module.source.NativePreferredFrameRateRange;
import com.scandit.datacapture.core.internal.module.source.NativeRegionStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import com.scandit.datacapture.core.internal.module.source.NativeVideoAspectRatio;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b@\u0010AB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b@\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00109\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%\"\u0004\b8\u0010'R*\u0010?\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/core/source/CameraSettings;", "", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "impl", "", "updateWithNativeObject$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;)V", "updateWithNativeObject", "Lcom/scandit/datacapture/core/internal/module/device/profiles/camera/CameraProfile;", Scopes.PROFILE, "addDefaultPropertiesFromProfile$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/device/profiles/camera/CameraProfile;)V", "addDefaultPropertiesFromProfile", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "setProperty", "getProperty", "", "isUsingApi2Features$scandit_capture_core", "()Z", "isUsingApi2Features", "_impl$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "_impl", "Lcom/scandit/datacapture/core/source/VideoResolution;", "a", "Lcom/scandit/datacapture/core/source/VideoResolution;", "getPreferredResolution", "()Lcom/scandit/datacapture/core/source/VideoResolution;", "setPreferredResolution", "(Lcom/scandit/datacapture/core/source/VideoResolution;)V", "preferredResolution", "", "b", "F", "getZoomFactor", "()F", "setZoomFactor", "(F)V", "zoomFactor", "c", "getZoomGestureZoomFactor", "setZoomGestureZoomFactor", "zoomGestureZoomFactor", "Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "d", "Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "getFocusGestureStrategy", "()Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "setFocusGestureStrategy", "(Lcom/scandit/datacapture/core/source/FocusGestureStrategy;)V", "focusGestureStrategy", "<set-?>", "e", "getMaxFrameRate", "setMaxFrameRate", "maxFrameRate", "g", "Z", "getShouldPreferSmoothAutoFocus", "setShouldPreferSmoothAutoFocus", "(Z)V", "shouldPreferSmoothAutoFocus", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CameraSettings {

    @Deprecated
    @NotNull
    public static final String FOCUS_STRATEGY_AUTO = "auto";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private VideoResolution preferredResolution;

    /* renamed from: b, reason: from kotlin metadata */
    private float zoomFactor;

    /* renamed from: c, reason: from kotlin metadata */
    private float zoomGestureZoomFactor;

    /* renamed from: d, reason: from kotlin metadata */
    private FocusGestureStrategy focusGestureStrategy;

    /* renamed from: e, reason: from kotlin metadata */
    private float maxFrameRate;
    private final HashMap f;

    /* renamed from: g, reason: from kotlin metadata */
    private boolean shouldPreferSmoothAutoFocus;

    private CameraSettings(VideoResolution videoResolution, FocusGestureStrategy focusGestureStrategy) {
        this.preferredResolution = videoResolution;
        this.zoomFactor = 1.0f;
        this.zoomGestureZoomFactor = 2.0f;
        this.focusGestureStrategy = focusGestureStrategy;
        this.maxFrameRate = 30.0f;
        this.f = new HashMap();
        this.shouldPreferSmoothAutoFocus = false;
        a();
    }

    private final void a() {
        if (this.shouldPreferSmoothAutoFocus) {
            this.f.put("macroAutofocusMode", "off");
        }
    }

    @NotNull
    public final NativeCameraSettings _impl$scandit_capture_core() {
        HashMap map = this.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!D0.a().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(JsonUtils.jsonFromObject(linkedHashMap));
        VideoResolution videoResolution = this.preferredResolution;
        Float fA = a("minFrameRate");
        float fFloatValue = fA != null ? fA.floatValue() : 15.0f;
        Float fA2 = a("maxFrameRate");
        float fFloatValue2 = fA2 != null ? fA2.floatValue() : 30.0f;
        float f = this.zoomFactor;
        float f2 = this.zoomGestureZoomFactor;
        Float fA3 = a("manualLensPosition");
        float fFloatValue3 = fA3 != null ? fA3.floatValue() : -1.0f;
        Object property = getProperty("focusStrategy");
        String strFocusStrategyToString = property instanceof String ? (String) property : null;
        if (strFocusStrategyToString == null) {
            NativeFocusStrategy focusStrategy = NativeFocusStrategy.AUTO;
            Intrinsics.h(focusStrategy, "focusStrategy");
            strFocusStrategyToString = NativeEnumSerializer.focusStrategyToString(focusStrategy);
            Intrinsics.g(strFocusStrategyToString, "focusStrategyToString(this)");
        }
        NativeFocusStrategy nativeFocusStrategyFocusStrategyFromJsonString = NativeEnumDeserializer.focusStrategyFromJsonString(strFocusStrategyToString);
        Intrinsics.g(nativeFocusStrategyFocusStrategyFromJsonString, "focusStrategyFromJsonString(json)");
        NativeFocusSettings nativeFocusSettings = new NativeFocusSettings(fFloatValue3, nativeFocusStrategyFocusStrategyFromJsonString, this.shouldPreferSmoothAutoFocus, nativeJsonValueFromString, null, this.focusGestureStrategy);
        Object property2 = getProperty("api");
        Integer num = property2 instanceof Integer ? (Integer) property2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Object property3 = getProperty("usesApi2Features");
        Boolean bool = property3 instanceof Boolean ? (Boolean) property3 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object property4 = getProperty("overwriteWithHighestResolution");
        Boolean bool2 = property4 instanceof Boolean ? (Boolean) property4 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Float fA4 = a("exposureTargetBias");
        float fFloatValue4 = fA4 != null ? fA4.floatValue() : BitmapDescriptorFactory.HUE_RED;
        Object property5 = getProperty("colorCorrection");
        Boolean bool3 = property5 instanceof Boolean ? (Boolean) property5 : null;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        Object property6 = getProperty("toneMappingCurve");
        NativeTonemapCurve nativeTonemapCurve = property6 instanceof NativeTonemapCurve ? (NativeTonemapCurve) property6 : null;
        if (nativeTonemapCurve == null) {
            nativeTonemapCurve = NativeTonemapCurve.NONE;
        }
        NativeTonemapCurve nativeTonemapCurve2 = nativeTonemapCurve;
        Object property7 = getProperty("noiseReductionMode");
        NativeNoiseReduction nativeNoiseReduction = property7 instanceof NativeNoiseReduction ? (NativeNoiseReduction) property7 : null;
        if (nativeNoiseReduction == null) {
            nativeNoiseReduction = NativeNoiseReduction.OFF;
        }
        Object property8 = getProperty("edgeEnhancementMode");
        NativeEdgeEnhancement nativeEdgeEnhancement = property8 instanceof NativeEdgeEnhancement ? (NativeEdgeEnhancement) property8 : null;
        if (nativeEdgeEnhancement == null) {
            nativeEdgeEnhancement = NativeEdgeEnhancement.OFF;
        }
        NativeEdgeEnhancement nativeEdgeEnhancement2 = nativeEdgeEnhancement;
        Object property9 = getProperty("regionStrategy");
        int i = iIntValue;
        String strRegionStrategyToString = property9 instanceof String ? (String) property9 : null;
        if (strRegionStrategyToString == null) {
            NativeRegionStrategy regionStrategy = NativeRegionStrategy.DEFAULT;
            Intrinsics.h(regionStrategy, "regionStrategy");
            strRegionStrategyToString = NativeEnumSerializer.regionStrategyToString(regionStrategy);
            Intrinsics.g(strRegionStrategyToString, "regionStrategyToString(this)");
        }
        NativeRegionStrategy nativeRegionStrategyRegionStrategyFromJsonString = NativeEnumDeserializer.regionStrategyFromJsonString(strRegionStrategyToString);
        Intrinsics.g(nativeRegionStrategyRegionStrategyFromJsonString, "regionStrategyFromJsonString(json)");
        Object property10 = getProperty("preferredAspectRatio");
        String strVideoAspectRatioToString = property10 instanceof String ? (String) property10 : null;
        if (strVideoAspectRatioToString == null) {
            NativeVideoAspectRatio aspectRatio = NativeVideoAspectRatio.AUTO;
            Intrinsics.h(aspectRatio, "aspectRatio");
            strVideoAspectRatioToString = NativeEnumSerializer.videoAspectRatioToString(aspectRatio);
            Intrinsics.g(strVideoAspectRatioToString, "videoAspectRatioToString(this)");
        }
        NativeVideoAspectRatio nativeVideoAspectRatioVideoAspectRatioFromJsonString = NativeEnumDeserializer.videoAspectRatioFromJsonString(strVideoAspectRatioToString);
        Intrinsics.g(nativeVideoAspectRatioVideoAspectRatioFromJsonString, "videoAspectRatioFromJsonString(json)");
        Object property11 = getProperty("arbitraryVideoResolution");
        String str = property11 instanceof String ? (String) property11 : null;
        Size2 size2FromJson = str == null ? null : Size2Deserializer.INSTANCE.fromJson(str);
        Object property12 = getProperty("closestResolutionTo12MPForFourToThreeAspectRatio");
        Size2 size2 = size2FromJson;
        Boolean bool4 = property12 instanceof Boolean ? (Boolean) property12 : null;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Object property13 = getProperty("enableSensorPixelModeMaximumResolution");
        boolean z = zBooleanValue4;
        Boolean bool5 = property13 instanceof Boolean ? (Boolean) property13 : null;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Object property14 = getProperty("preferredFrameRateRange");
        return new NativeCameraSettings(videoResolution, fFloatValue, fFloatValue2, f, f2, nativeFocusSettings, i, zBooleanValue, zBooleanValue2, fFloatValue4, zBooleanValue3, nativeTonemapCurve2, nativeNoiseReduction, nativeEdgeEnhancement2, nativeRegionStrategyRegionStrategyFromJsonString, 1.0f, nativeVideoAspectRatioVideoAspectRatioFromJsonString, size2, z, zBooleanValue5, nativeJsonValueFromString, property14 instanceof NativePreferredFrameRateRange ? (NativePreferredFrameRateRange) property14 : null);
    }

    public final void addDefaultPropertiesFromProfile$scandit_capture_core(@NotNull CameraProfile profile) {
        Intrinsics.h(profile, "profile");
        NativeFocusStrategy nativeFocusStrategyI = profile.i();
        if (nativeFocusStrategyI != null) {
            Object property = getProperty("focusStrategy");
            if (property == null || property.equals(FOCUS_STRATEGY_AUTO)) {
                setProperty("focusStrategy", nativeFocusStrategyI);
            }
        }
    }

    @NotNull
    public final FocusGestureStrategy getFocusGestureStrategy() {
        return this.focusGestureStrategy;
    }

    public final float getMaxFrameRate() {
        return this.maxFrameRate;
    }

    @NotNull
    public final VideoResolution getPreferredResolution() {
        return this.preferredResolution;
    }

    @Nullable
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        return this.f.get(name);
    }

    public final boolean getShouldPreferSmoothAutoFocus() {
        return this.shouldPreferSmoothAutoFocus;
    }

    public final float getZoomFactor() {
        return this.zoomFactor;
    }

    public final float getZoomGestureZoomFactor() {
        return this.zoomGestureZoomFactor;
    }

    public final boolean isUsingApi2Features$scandit_capture_core() {
        Object property = getProperty("usesApi2Features");
        if (Intrinsics.c(property instanceof Boolean ? (Boolean) property : null, Boolean.TRUE)) {
            return true;
        }
        Float fA = a("manualLensPosition");
        return (fA != null ? fA.floatValue() : -1.0f) >= BitmapDescriptorFactory.HUE_RED || this.preferredResolution == VideoResolution.UHD4K;
    }

    public final void setFocusGestureStrategy(@NotNull FocusGestureStrategy focusGestureStrategy) {
        Intrinsics.h(focusGestureStrategy, "<set-?>");
        this.focusGestureStrategy = focusGestureStrategy;
    }

    @Deprecated
    public final void setMaxFrameRate(float f) {
        this.maxFrameRate = f;
    }

    public final void setPreferredResolution(@NotNull VideoResolution videoResolution) {
        Intrinsics.h(videoResolution, "<set-?>");
        this.preferredResolution = videoResolution;
    }

    public final void setProperty(@NotNull String name, @Nullable Object value) {
        Intrinsics.h(name, "name");
        if (name.equals("focusStrategy") && (value instanceof NativeFocusStrategy)) {
            value = NativeEnumSerializer.focusStrategyToString((NativeFocusStrategy) value);
            Intrinsics.g(value, "focusStrategyToString(this)");
        }
        this.f.put(name, value);
        NativeFocusStrategy focusStrategy = NativeFocusStrategy.FORCE_CONTINUOUS;
        Intrinsics.h(focusStrategy, "focusStrategy");
        String strFocusStrategyToString = NativeEnumSerializer.focusStrategyToString(focusStrategy);
        Intrinsics.g(strFocusStrategyToString, "focusStrategyToString(this)");
        if (name.equals("focusStrategy") && Intrinsics.c(value, strFocusStrategyToString)) {
            this.f.put("macroAutofocusMode", "off");
        }
    }

    public final void setShouldPreferSmoothAutoFocus(boolean z) {
        this.shouldPreferSmoothAutoFocus = z;
        a();
    }

    public final void setZoomFactor(float f) {
        this.zoomFactor = f;
    }

    public final void setZoomGestureZoomFactor(float f) {
        this.zoomGestureZoomFactor = f;
    }

    public final void updateWithNativeObject$scandit_capture_core(@NotNull NativeCameraSettings impl) throws JSONException {
        Intrinsics.h(impl, "impl");
        VideoResolution preferredResolution = impl.getPreferredResolution();
        Intrinsics.g(preferredResolution, "impl.preferredResolution");
        this.preferredResolution = preferredResolution;
        this.zoomFactor = impl.getZoomFactor();
        this.zoomGestureZoomFactor = impl.getZoomGestureZoomFactor();
        setShouldPreferSmoothAutoFocus(impl.getFocus().getShouldPreferSmoothAutoFocus());
        FocusGestureStrategy focusGestureStrategy = impl.getFocus().getFocusGestureStrategy();
        Intrinsics.g(focusGestureStrategy, "impl.focus.focusGestureStrategy");
        this.focusGestureStrategy = focusGestureStrategy;
        setProperty("api", Integer.valueOf(impl.getApi()));
        setProperty("usesApi2Features", Boolean.valueOf(impl.getUsesCameraApi2Features()));
        setProperty("manualLensPosition", Float.valueOf(impl.getFocus().getManualLensPosition()));
        setProperty("overwriteWithHighestResolution", Boolean.valueOf(impl.getOverwriteWithHighestResolution()));
        setProperty("exposureTargetBias", Float.valueOf(impl.getExposureTargetBias()));
        setProperty("maxFrameRate", Float.valueOf(impl.getMaxFrameRate()));
        setProperty("minFrameRate", Float.valueOf(impl.getMinFrameRate()));
        setProperty("colorCorrection", Boolean.valueOf(impl.getColorCorrection()));
        setProperty("toneMappingCurve", impl.getToneMappingCurve());
        setProperty("edgeEnhancementMode", impl.getEdgeEnhancementMode());
        setProperty("noiseReductionMode", impl.getNoiseReductionMode());
        NativeFocusStrategy selectedFocusStrategy = impl.getFocus().getSelectedFocusStrategy();
        Intrinsics.g(selectedFocusStrategy, "impl.focus.selectedFocusStrategy");
        String strFocusStrategyToString = NativeEnumSerializer.focusStrategyToString(selectedFocusStrategy);
        Intrinsics.g(strFocusStrategyToString, "focusStrategyToString(this)");
        setProperty("focusStrategy", strFocusStrategyToString);
        NativeRegionStrategy regionControlStrategy = impl.getRegionControlStrategy();
        Intrinsics.g(regionControlStrategy, "impl.regionControlStrategy");
        String strRegionStrategyToString = NativeEnumSerializer.regionStrategyToString(regionControlStrategy);
        Intrinsics.g(strRegionStrategyToString, "regionStrategyToString(this)");
        setProperty("regionStrategy", strRegionStrategyToString);
        NativeVideoAspectRatio preferredAspectRatio = impl.getPreferredAspectRatio();
        Intrinsics.g(preferredAspectRatio, "impl.preferredAspectRatio");
        String strVideoAspectRatioToString = NativeEnumSerializer.videoAspectRatioToString(preferredAspectRatio);
        Intrinsics.g(strVideoAspectRatioToString, "videoAspectRatioToString(this)");
        setProperty("preferredAspectRatio", strVideoAspectRatioToString);
        setProperty("enableSensorPixelModeMaximumResolution", Boolean.valueOf(impl.getEnableSensorPixelModeMaximumResolution()));
        if (impl.getArbitraryVideoResolution() != null) {
            Size2 arbitraryVideoResolution = impl.getArbitraryVideoResolution();
            Intrinsics.g(arbitraryVideoResolution, "impl.arbitraryVideoResolution");
            setProperty("arbitraryVideoResolution", Size2UtilsKt.toJson(arbitraryVideoResolution));
        }
        NativeJsonValue properties = impl.getProperties();
        if (properties != null) {
            String string = properties.toString();
            Intrinsics.g(string, "it.toString()");
            Object objObjectFromJson = JsonUtils.objectFromJson(string);
            Map map = objObjectFromJson instanceof Map ? (Map) objObjectFromJson : null;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    setProperty((String) entry.getKey(), entry.getValue());
                }
            }
        }
        NativeJsonValue properties2 = impl.getFocus().getProperties();
        if (properties2 != null) {
            String string2 = properties2.toString();
            Intrinsics.g(string2, "it.toString()");
            Object objObjectFromJson2 = JsonUtils.objectFromJson(string2);
            Map map2 = objObjectFromJson2 instanceof Map ? (Map) objObjectFromJson2 : null;
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    setProperty((String) entry2.getKey(), entry2.getValue());
                }
            }
        }
        setProperty("preferredFrameRateRange", impl.getPreferredFrameRateRange());
    }

    private final Float a(String str) {
        Object obj = this.f.get(str);
        Float fValueOf = obj instanceof Float ? (Float) obj : null;
        if (fValueOf == null) {
            Double d = obj instanceof Double ? (Double) obj : null;
            fValueOf = d != null ? Float.valueOf((float) d.doubleValue()) : null;
            if (fValueOf == null) {
                if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                    return Float.valueOf(r5.intValue());
                }
                return null;
            }
        }
        return fValueOf;
    }

    public CameraSettings() {
        this(VideoResolution.AUTO, FocusGestureStrategy.MANUAL_UNTIL_CAPTURE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSettings(@NotNull NativeCameraSettings impl) throws JSONException {
        this();
        Intrinsics.h(impl, "impl");
        updateWithNativeObject$scandit_capture_core(impl);
    }
}
