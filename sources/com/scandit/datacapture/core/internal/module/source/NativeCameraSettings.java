package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeCameraSettings {
    final int api;
    final Size2 arbitraryVideoResolution;
    final boolean chooseClosestResolutionTo12MPForFourThreeAspectRatio;
    final boolean colorCorrection;
    final NativeEdgeEnhancement edgeEnhancementMode;
    final boolean enableSensorPixelModeMaximumResolution;
    final float exposureTargetBias;
    final NativeFocusSettings focus;
    final float maxFrameRate;
    final float minFrameRate;
    final NativeNoiseReduction noiseReductionMode;
    final boolean overwriteWithHighestResolution;
    final NativeVideoAspectRatio preferredAspectRatio;
    final NativePreferredFrameRateRange preferredFrameRateRange;
    final VideoResolution preferredResolution;
    final NativeJsonValue properties;
    final NativeRegionStrategy regionControlStrategy;
    final NativeTonemapCurve toneMappingCurve;
    final float torchLevel;
    final boolean usesCameraApi2Features;
    final float zoomFactor;
    final float zoomGestureZoomFactor;

    public NativeCameraSettings(VideoResolution videoResolution, float f, float f2, float f3, float f4, NativeFocusSettings nativeFocusSettings, int i, boolean z, boolean z2, float f5, boolean z3, NativeTonemapCurve nativeTonemapCurve, NativeNoiseReduction nativeNoiseReduction, NativeEdgeEnhancement nativeEdgeEnhancement, NativeRegionStrategy nativeRegionStrategy, float f6, NativeVideoAspectRatio nativeVideoAspectRatio, Size2 size2, boolean z4, boolean z5, NativeJsonValue nativeJsonValue, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        this.preferredResolution = videoResolution;
        this.minFrameRate = f;
        this.maxFrameRate = f2;
        this.zoomFactor = f3;
        this.zoomGestureZoomFactor = f4;
        this.focus = nativeFocusSettings;
        this.api = i;
        this.usesCameraApi2Features = z;
        this.overwriteWithHighestResolution = z2;
        this.exposureTargetBias = f5;
        this.colorCorrection = z3;
        this.toneMappingCurve = nativeTonemapCurve;
        this.noiseReductionMode = nativeNoiseReduction;
        this.edgeEnhancementMode = nativeEdgeEnhancement;
        this.regionControlStrategy = nativeRegionStrategy;
        this.torchLevel = f6;
        this.preferredAspectRatio = nativeVideoAspectRatio;
        this.arbitraryVideoResolution = size2;
        this.chooseClosestResolutionTo12MPForFourThreeAspectRatio = z4;
        this.enableSensorPixelModeMaximumResolution = z5;
        this.properties = nativeJsonValue;
        this.preferredFrameRateRange = nativePreferredFrameRateRange;
    }

    public boolean equals(Object obj) {
        Size2 size2;
        NativeJsonValue nativeJsonValue;
        if (!(obj instanceof NativeCameraSettings)) {
            return false;
        }
        NativeCameraSettings nativeCameraSettings = (NativeCameraSettings) obj;
        if (this.preferredResolution == nativeCameraSettings.preferredResolution && this.minFrameRate == nativeCameraSettings.minFrameRate && this.maxFrameRate == nativeCameraSettings.maxFrameRate && this.zoomFactor == nativeCameraSettings.zoomFactor && this.zoomGestureZoomFactor == nativeCameraSettings.zoomGestureZoomFactor && this.focus.equals(nativeCameraSettings.focus) && this.api == nativeCameraSettings.api && this.usesCameraApi2Features == nativeCameraSettings.usesCameraApi2Features && this.overwriteWithHighestResolution == nativeCameraSettings.overwriteWithHighestResolution && this.exposureTargetBias == nativeCameraSettings.exposureTargetBias && this.colorCorrection == nativeCameraSettings.colorCorrection && this.toneMappingCurve == nativeCameraSettings.toneMappingCurve && this.noiseReductionMode == nativeCameraSettings.noiseReductionMode && this.edgeEnhancementMode == nativeCameraSettings.edgeEnhancementMode && this.regionControlStrategy == nativeCameraSettings.regionControlStrategy && this.torchLevel == nativeCameraSettings.torchLevel && this.preferredAspectRatio == nativeCameraSettings.preferredAspectRatio && ((((size2 = this.arbitraryVideoResolution) == null && nativeCameraSettings.arbitraryVideoResolution == null) || (size2 != null && size2.equals(nativeCameraSettings.arbitraryVideoResolution))) && this.chooseClosestResolutionTo12MPForFourThreeAspectRatio == nativeCameraSettings.chooseClosestResolutionTo12MPForFourThreeAspectRatio && this.enableSensorPixelModeMaximumResolution == nativeCameraSettings.enableSensorPixelModeMaximumResolution && (((nativeJsonValue = this.properties) == null && nativeCameraSettings.properties == null) || (nativeJsonValue != null && nativeJsonValue.equals(nativeCameraSettings.properties))))) {
            NativePreferredFrameRateRange nativePreferredFrameRateRange = this.preferredFrameRateRange;
            if (nativePreferredFrameRateRange == null && nativeCameraSettings.preferredFrameRateRange == null) {
                return true;
            }
            if (nativePreferredFrameRateRange != null && nativePreferredFrameRateRange.equals(nativeCameraSettings.preferredFrameRateRange)) {
                return true;
            }
        }
        return false;
    }

    public int getApi() {
        return this.api;
    }

    public Size2 getArbitraryVideoResolution() {
        return this.arbitraryVideoResolution;
    }

    public boolean getChooseClosestResolutionTo12MPForFourThreeAspectRatio() {
        return this.chooseClosestResolutionTo12MPForFourThreeAspectRatio;
    }

    public boolean getColorCorrection() {
        return this.colorCorrection;
    }

    public NativeEdgeEnhancement getEdgeEnhancementMode() {
        return this.edgeEnhancementMode;
    }

    public boolean getEnableSensorPixelModeMaximumResolution() {
        return this.enableSensorPixelModeMaximumResolution;
    }

    public float getExposureTargetBias() {
        return this.exposureTargetBias;
    }

    public NativeFocusSettings getFocus() {
        return this.focus;
    }

    public float getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public float getMinFrameRate() {
        return this.minFrameRate;
    }

    public NativeNoiseReduction getNoiseReductionMode() {
        return this.noiseReductionMode;
    }

    public boolean getOverwriteWithHighestResolution() {
        return this.overwriteWithHighestResolution;
    }

    public NativeVideoAspectRatio getPreferredAspectRatio() {
        return this.preferredAspectRatio;
    }

    public NativePreferredFrameRateRange getPreferredFrameRateRange() {
        return this.preferredFrameRateRange;
    }

    public VideoResolution getPreferredResolution() {
        return this.preferredResolution;
    }

    public NativeJsonValue getProperties() {
        return this.properties;
    }

    public NativeRegionStrategy getRegionControlStrategy() {
        return this.regionControlStrategy;
    }

    public NativeTonemapCurve getToneMappingCurve() {
        return this.toneMappingCurve;
    }

    public float getTorchLevel() {
        return this.torchLevel;
    }

    public boolean getUsesCameraApi2Features() {
        return this.usesCameraApi2Features;
    }

    public float getZoomFactor() {
        return this.zoomFactor;
    }

    public float getZoomGestureZoomFactor() {
        return this.zoomGestureZoomFactor;
    }

    public int hashCode() {
        int iHashCode = (this.preferredAspectRatio.hashCode() + androidx.compose.ui.input.pointer.a.a(this.torchLevel, (this.regionControlStrategy.hashCode() + ((this.edgeEnhancementMode.hashCode() + ((this.noiseReductionMode.hashCode() + ((this.toneMappingCurve.hashCode() + ((androidx.compose.ui.input.pointer.a.a(this.exposureTargetBias, (((((((this.focus.hashCode() + androidx.compose.ui.input.pointer.a.a(this.zoomGestureZoomFactor, androidx.compose.ui.input.pointer.a.a(this.zoomFactor, androidx.compose.ui.input.pointer.a.a(this.maxFrameRate, androidx.compose.ui.input.pointer.a.a(this.minFrameRate, (this.preferredResolution.hashCode() + 527) * 31, 31), 31), 31), 31)) * 31) + this.api) * 31) + (this.usesCameraApi2Features ? 1 : 0)) * 31) + (this.overwriteWithHighestResolution ? 1 : 0)) * 31, 31) + (this.colorCorrection ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        Size2 size2 = this.arbitraryVideoResolution;
        int iHashCode2 = (((((iHashCode + (size2 == null ? 0 : size2.hashCode())) * 31) + (this.chooseClosestResolutionTo12MPForFourThreeAspectRatio ? 1 : 0)) * 31) + (this.enableSensorPixelModeMaximumResolution ? 1 : 0)) * 31;
        NativeJsonValue nativeJsonValue = this.properties;
        int iHashCode3 = (iHashCode2 + (nativeJsonValue == null ? 0 : nativeJsonValue.hashCode())) * 31;
        NativePreferredFrameRateRange nativePreferredFrameRateRange = this.preferredFrameRateRange;
        return iHashCode3 + (nativePreferredFrameRateRange != null ? nativePreferredFrameRateRange.hashCode() : 0);
    }

    public String toString() {
        return "NativeCameraSettings{preferredResolution=" + this.preferredResolution + ",minFrameRate=" + this.minFrameRate + ",maxFrameRate=" + this.maxFrameRate + ",zoomFactor=" + this.zoomFactor + ",zoomGestureZoomFactor=" + this.zoomGestureZoomFactor + ",focus=" + this.focus + ",api=" + this.api + ",usesCameraApi2Features=" + this.usesCameraApi2Features + ",overwriteWithHighestResolution=" + this.overwriteWithHighestResolution + ",exposureTargetBias=" + this.exposureTargetBias + ",colorCorrection=" + this.colorCorrection + ",toneMappingCurve=" + this.toneMappingCurve + ",noiseReductionMode=" + this.noiseReductionMode + ",edgeEnhancementMode=" + this.edgeEnhancementMode + ",regionControlStrategy=" + this.regionControlStrategy + ",torchLevel=" + this.torchLevel + ",preferredAspectRatio=" + this.preferredAspectRatio + ",arbitraryVideoResolution=" + this.arbitraryVideoResolution + ",chooseClosestResolutionTo12MPForFourThreeAspectRatio=" + this.chooseClosestResolutionTo12MPForFourThreeAspectRatio + ",enableSensorPixelModeMaximumResolution=" + this.enableSensorPixelModeMaximumResolution + ",properties=" + this.properties + ",preferredFrameRateRange=" + this.preferredFrameRateRange + "}";
    }
}
