package com.scandit.datacapture.barcode.find.serialization;

import android.view.View;
import com.scandit.datacapture.barcode.T1;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindView;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.AnchorDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindViewDeserializer;", "", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "barcodeFind", "", "json", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "viewFromJson", "view", "", "updateViewFromJson", "", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeFindViewDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17670a = new ArrayList();

    private static void a(BarcodeFindView barcodeFindView, JsonValue jsonValue) {
        String str;
        Object objFromJson;
        Boolean bool;
        Object objFromJson2;
        Boolean bool2;
        Object objFromJson3;
        Boolean bool3;
        Object objFromJson4;
        Boolean bool4;
        Object objFromJson5;
        Boolean bool5;
        Object objFromJson6;
        Boolean bool6;
        Object objFromJson7;
        Boolean bool7;
        Object objFromJson8;
        Anchor anchor;
        Object objFromJson9;
        Boolean bool8;
        Object objFromJson10;
        String str2;
        Object objFromJson11;
        String str3;
        Object objFromJson12;
        String str4;
        Object objFromJson13;
        String str5;
        Object objFromJson14;
        String str6;
        Object objFromJson15;
        String str7;
        Object objFromJson16;
        String str8;
        Object objFromJson17;
        String str9;
        boolean zContains = jsonValue.contains("shouldShowUserGuidanceView");
        EmptyList emptyList = EmptyList.d;
        Class cls = Boolean.TYPE;
        if (zContains) {
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            KClass kClassB = reflectionFactory.b(Boolean.class);
            str = "null cannot be cast to non-null type kotlin.Boolean";
            if (kClassB.equals(reflectionFactory.b(BarcodeFindViewSettings.class))) {
                objFromJson = new T1().a(jsonValue.requireByKeyAsObject("shouldShowUserGuidanceView"));
            } else if (kClassB.equals(reflectionFactory.b(cls))) {
                objFromJson = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowUserGuidanceView"));
            } else if (kClassB.equals(reflectionFactory.b(String.class))) {
                objFromJson = jsonValue.requireByKeyAsString("shouldShowUserGuidanceView");
            } else if (kClassB.equals(reflectionFactory.b(CameraSettings.class))) {
                JsonValue json = jsonValue.requireByKeyAsObject("shouldShowUserGuidanceView");
                Intrinsics.h(json, "json");
                CameraSettings recommendedCameraSettings = json.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings, json.jsonString());
                objFromJson = recommendedCameraSettings;
            } else {
                if (!kClassB.equals(reflectionFactory.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowUserGuidanceView"));
            }
            if (objFromJson == null) {
                throw new NullPointerException(str);
            }
            bool = (Boolean) objFromJson;
        } else {
            str = "null cannot be cast to non-null type kotlin.Boolean";
            bool = null;
        }
        if (bool != null) {
            barcodeFindView.setShouldShowUserGuidanceView(bool.booleanValue());
        }
        if (jsonValue.contains("shouldShowHints")) {
            ReflectionFactory reflectionFactory2 = Reflection.f24268a;
            KClass kClassB2 = reflectionFactory2.b(Boolean.class);
            if (kClassB2.equals(reflectionFactory2.b(BarcodeFindViewSettings.class))) {
                objFromJson2 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowHints"));
            } else if (kClassB2.equals(reflectionFactory2.b(cls))) {
                objFromJson2 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowHints"));
            } else if (kClassB2.equals(reflectionFactory2.b(String.class))) {
                objFromJson2 = jsonValue.requireByKeyAsString("shouldShowHints");
            } else if (kClassB2.equals(reflectionFactory2.b(CameraSettings.class))) {
                JsonValue json2 = jsonValue.requireByKeyAsObject("shouldShowHints");
                Intrinsics.h(json2, "json");
                CameraSettings recommendedCameraSettings2 = json2.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json2._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings2, json2.jsonString());
                objFromJson2 = recommendedCameraSettings2;
            } else {
                if (!kClassB2.equals(reflectionFactory2.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson2 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowHints"));
            }
            if (objFromJson2 == null) {
                throw new NullPointerException(str);
            }
            bool2 = (Boolean) objFromJson2;
        } else {
            bool2 = null;
        }
        if (bool2 != null) {
            barcodeFindView.setShouldShowHints(bool2.booleanValue());
        }
        if (jsonValue.contains("shouldShowCarousel")) {
            ReflectionFactory reflectionFactory3 = Reflection.f24268a;
            KClass kClassB3 = reflectionFactory3.b(Boolean.class);
            if (kClassB3.equals(reflectionFactory3.b(BarcodeFindViewSettings.class))) {
                objFromJson3 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowCarousel"));
            } else if (kClassB3.equals(reflectionFactory3.b(cls))) {
                objFromJson3 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowCarousel"));
            } else if (kClassB3.equals(reflectionFactory3.b(String.class))) {
                objFromJson3 = jsonValue.requireByKeyAsString("shouldShowCarousel");
            } else if (kClassB3.equals(reflectionFactory3.b(CameraSettings.class))) {
                JsonValue json3 = jsonValue.requireByKeyAsObject("shouldShowCarousel");
                Intrinsics.h(json3, "json");
                CameraSettings recommendedCameraSettings3 = json3.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json3._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings3, json3.jsonString());
                objFromJson3 = recommendedCameraSettings3;
            } else {
                if (!kClassB3.equals(reflectionFactory3.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson3 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowCarousel"));
            }
            if (objFromJson3 == null) {
                throw new NullPointerException(str);
            }
            bool3 = (Boolean) objFromJson3;
        } else {
            bool3 = null;
        }
        if (bool3 != null) {
            barcodeFindView.setShouldShowCarousel(bool3.booleanValue());
        }
        if (jsonValue.contains("shouldShowPauseButton")) {
            ReflectionFactory reflectionFactory4 = Reflection.f24268a;
            KClass kClassB4 = reflectionFactory4.b(Boolean.class);
            if (kClassB4.equals(reflectionFactory4.b(BarcodeFindViewSettings.class))) {
                objFromJson4 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowPauseButton"));
            } else if (kClassB4.equals(reflectionFactory4.b(cls))) {
                objFromJson4 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowPauseButton"));
            } else if (kClassB4.equals(reflectionFactory4.b(String.class))) {
                objFromJson4 = jsonValue.requireByKeyAsString("shouldShowPauseButton");
            } else if (kClassB4.equals(reflectionFactory4.b(CameraSettings.class))) {
                JsonValue json4 = jsonValue.requireByKeyAsObject("shouldShowPauseButton");
                Intrinsics.h(json4, "json");
                CameraSettings recommendedCameraSettings4 = json4.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json4._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings4, json4.jsonString());
                objFromJson4 = recommendedCameraSettings4;
            } else {
                if (!kClassB4.equals(reflectionFactory4.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson4 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowPauseButton"));
            }
            if (objFromJson4 == null) {
                throw new NullPointerException(str);
            }
            bool4 = (Boolean) objFromJson4;
        } else {
            bool4 = null;
        }
        if (bool4 != null) {
            barcodeFindView.setShouldShowPauseButton(bool4.booleanValue());
        }
        if (jsonValue.contains("shouldShowFinishButton")) {
            ReflectionFactory reflectionFactory5 = Reflection.f24268a;
            KClass kClassB5 = reflectionFactory5.b(Boolean.class);
            if (kClassB5.equals(reflectionFactory5.b(BarcodeFindViewSettings.class))) {
                objFromJson5 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowFinishButton"));
            } else if (kClassB5.equals(reflectionFactory5.b(cls))) {
                objFromJson5 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowFinishButton"));
            } else if (kClassB5.equals(reflectionFactory5.b(String.class))) {
                objFromJson5 = jsonValue.requireByKeyAsString("shouldShowFinishButton");
            } else if (kClassB5.equals(reflectionFactory5.b(CameraSettings.class))) {
                JsonValue json5 = jsonValue.requireByKeyAsObject("shouldShowFinishButton");
                Intrinsics.h(json5, "json");
                CameraSettings recommendedCameraSettings5 = json5.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json5._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings5, json5.jsonString());
                objFromJson5 = recommendedCameraSettings5;
            } else {
                if (!kClassB5.equals(reflectionFactory5.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson5 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowFinishButton"));
            }
            if (objFromJson5 == null) {
                throw new NullPointerException(str);
            }
            bool5 = (Boolean) objFromJson5;
        } else {
            bool5 = null;
        }
        if (bool5 != null) {
            barcodeFindView.setShouldShowFinishButton(bool5.booleanValue());
        }
        if (jsonValue.contains("shouldShowProgressBar")) {
            ReflectionFactory reflectionFactory6 = Reflection.f24268a;
            KClass kClassB6 = reflectionFactory6.b(Boolean.class);
            if (kClassB6.equals(reflectionFactory6.b(BarcodeFindViewSettings.class))) {
                objFromJson6 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowProgressBar"));
            } else if (kClassB6.equals(reflectionFactory6.b(cls))) {
                objFromJson6 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowProgressBar"));
            } else if (kClassB6.equals(reflectionFactory6.b(String.class))) {
                objFromJson6 = jsonValue.requireByKeyAsString("shouldShowProgressBar");
            } else if (kClassB6.equals(reflectionFactory6.b(CameraSettings.class))) {
                JsonValue json6 = jsonValue.requireByKeyAsObject("shouldShowProgressBar");
                Intrinsics.h(json6, "json");
                CameraSettings recommendedCameraSettings6 = json6.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json6._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings6, json6.jsonString());
                objFromJson6 = recommendedCameraSettings6;
            } else {
                if (!kClassB6.equals(reflectionFactory6.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson6 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowProgressBar"));
            }
            if (objFromJson6 == null) {
                throw new NullPointerException(str);
            }
            bool6 = (Boolean) objFromJson6;
        } else {
            bool6 = null;
        }
        if (bool6 != null) {
            barcodeFindView.setShouldShowProgressBar(bool6.booleanValue());
        }
        if (jsonValue.contains("shouldShowTorchControl")) {
            ReflectionFactory reflectionFactory7 = Reflection.f24268a;
            KClass kClassB7 = reflectionFactory7.b(Boolean.class);
            if (kClassB7.equals(reflectionFactory7.b(BarcodeFindViewSettings.class))) {
                objFromJson7 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowTorchControl"));
            } else if (kClassB7.equals(reflectionFactory7.b(cls))) {
                objFromJson7 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowTorchControl"));
            } else if (kClassB7.equals(reflectionFactory7.b(String.class))) {
                objFromJson7 = jsonValue.requireByKeyAsString("shouldShowTorchControl");
            } else if (kClassB7.equals(reflectionFactory7.b(CameraSettings.class))) {
                JsonValue json7 = jsonValue.requireByKeyAsObject("shouldShowTorchControl");
                Intrinsics.h(json7, "json");
                CameraSettings recommendedCameraSettings7 = json7.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json7._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings7, json7.jsonString());
                objFromJson7 = recommendedCameraSettings7;
            } else {
                if (!kClassB7.equals(reflectionFactory7.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson7 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowTorchControl"));
            }
            if (objFromJson7 == null) {
                throw new NullPointerException(str);
            }
            bool7 = (Boolean) objFromJson7;
        } else {
            bool7 = null;
        }
        if (bool7 != null) {
            barcodeFindView.setShouldShowTorchControl(bool7.booleanValue());
        }
        if (jsonValue.contains("torchControlPosition")) {
            ReflectionFactory reflectionFactory8 = Reflection.f24268a;
            KClass kClassB8 = reflectionFactory8.b(Anchor.class);
            if (kClassB8.equals(reflectionFactory8.b(BarcodeFindViewSettings.class))) {
                objFromJson8 = new T1().a(jsonValue.requireByKeyAsObject("torchControlPosition"));
            } else if (kClassB8.equals(reflectionFactory8.b(cls))) {
                objFromJson8 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("torchControlPosition"));
            } else if (kClassB8.equals(reflectionFactory8.b(String.class))) {
                objFromJson8 = jsonValue.requireByKeyAsString("torchControlPosition");
            } else if (kClassB8.equals(reflectionFactory8.b(CameraSettings.class))) {
                JsonValue json8 = jsonValue.requireByKeyAsObject("torchControlPosition");
                Intrinsics.h(json8, "json");
                CameraSettings recommendedCameraSettings8 = json8.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json8._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings8, json8.jsonString());
                objFromJson8 = recommendedCameraSettings8;
            } else {
                if (!kClassB8.equals(reflectionFactory8.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson8 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("torchControlPosition"));
            }
            if (objFromJson8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.core.common.geometry.Anchor");
            }
            anchor = (Anchor) objFromJson8;
        } else {
            anchor = null;
        }
        if (anchor != null) {
            barcodeFindView.setTorchControlPosition(anchor);
        }
        if (jsonValue.contains("shouldShowZoomControl")) {
            ReflectionFactory reflectionFactory9 = Reflection.f24268a;
            KClass kClassB9 = reflectionFactory9.b(Boolean.class);
            if (kClassB9.equals(reflectionFactory9.b(BarcodeFindViewSettings.class))) {
                objFromJson9 = new T1().a(jsonValue.requireByKeyAsObject("shouldShowZoomControl"));
            } else if (kClassB9.equals(reflectionFactory9.b(cls))) {
                objFromJson9 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowZoomControl"));
            } else if (kClassB9.equals(reflectionFactory9.b(String.class))) {
                objFromJson9 = jsonValue.requireByKeyAsString("shouldShowZoomControl");
            } else if (kClassB9.equals(reflectionFactory9.b(CameraSettings.class))) {
                JsonValue json9 = jsonValue.requireByKeyAsObject("shouldShowZoomControl");
                Intrinsics.h(json9, "json");
                CameraSettings recommendedCameraSettings9 = json9.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json9._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings9, json9.jsonString());
                objFromJson9 = recommendedCameraSettings9;
            } else {
                if (!kClassB9.equals(reflectionFactory9.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson9 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowZoomControl"));
            }
            if (objFromJson9 == null) {
                throw new NullPointerException(str);
            }
            bool8 = (Boolean) objFromJson9;
        } else {
            bool8 = null;
        }
        if (bool8 != null) {
            barcodeFindView.setShouldShowZoomControl(bool8.booleanValue());
        }
        if (jsonValue.contains("textForCollapseCardsButton")) {
            ReflectionFactory reflectionFactory10 = Reflection.f24268a;
            KClass kClassB10 = reflectionFactory10.b(String.class);
            if (kClassB10.equals(reflectionFactory10.b(BarcodeFindViewSettings.class))) {
                objFromJson10 = new T1().a(jsonValue.requireByKeyAsObject("textForCollapseCardsButton"));
            } else if (kClassB10.equals(reflectionFactory10.b(cls))) {
                objFromJson10 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForCollapseCardsButton"));
            } else if (kClassB10.equals(reflectionFactory10.b(String.class))) {
                objFromJson10 = jsonValue.requireByKeyAsString("textForCollapseCardsButton");
            } else if (kClassB10.equals(reflectionFactory10.b(CameraSettings.class))) {
                JsonValue json10 = jsonValue.requireByKeyAsObject("textForCollapseCardsButton");
                Intrinsics.h(json10, "json");
                CameraSettings recommendedCameraSettings10 = json10.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json10._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings10, json10.jsonString());
                objFromJson10 = recommendedCameraSettings10;
            } else {
                if (!kClassB10.equals(reflectionFactory10.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson10 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForCollapseCardsButton"));
            }
            if (objFromJson10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str2 = (String) objFromJson10;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            barcodeFindView.setTextForCollapseCardsButton(str2);
        }
        if (jsonValue.contains("textForAllItemsFoundSuccessfullyHint")) {
            ReflectionFactory reflectionFactory11 = Reflection.f24268a;
            KClass kClassB11 = reflectionFactory11.b(String.class);
            if (kClassB11.equals(reflectionFactory11.b(BarcodeFindViewSettings.class))) {
                objFromJson11 = new T1().a(jsonValue.requireByKeyAsObject("textForAllItemsFoundSuccessfullyHint"));
            } else if (kClassB11.equals(reflectionFactory11.b(cls))) {
                objFromJson11 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForAllItemsFoundSuccessfullyHint"));
            } else if (kClassB11.equals(reflectionFactory11.b(String.class))) {
                objFromJson11 = jsonValue.requireByKeyAsString("textForAllItemsFoundSuccessfullyHint");
            } else if (kClassB11.equals(reflectionFactory11.b(CameraSettings.class))) {
                JsonValue json11 = jsonValue.requireByKeyAsObject("textForAllItemsFoundSuccessfullyHint");
                Intrinsics.h(json11, "json");
                CameraSettings recommendedCameraSettings11 = json11.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json11._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings11, json11.jsonString());
                objFromJson11 = recommendedCameraSettings11;
            } else {
                if (!kClassB11.equals(reflectionFactory11.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson11 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForAllItemsFoundSuccessfullyHint"));
            }
            if (objFromJson11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str3 = (String) objFromJson11;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            barcodeFindView.setTextForAllItemsFoundSuccessfullyHint(str3);
        }
        if (jsonValue.contains("textForPointAtBarcodesToSearchHint")) {
            ReflectionFactory reflectionFactory12 = Reflection.f24268a;
            KClass kClassB12 = reflectionFactory12.b(String.class);
            if (kClassB12.equals(reflectionFactory12.b(BarcodeFindViewSettings.class))) {
                objFromJson12 = new T1().a(jsonValue.requireByKeyAsObject("textForPointAtBarcodesToSearchHint"));
            } else if (kClassB12.equals(reflectionFactory12.b(cls))) {
                objFromJson12 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForPointAtBarcodesToSearchHint"));
            } else if (kClassB12.equals(reflectionFactory12.b(String.class))) {
                objFromJson12 = jsonValue.requireByKeyAsString("textForPointAtBarcodesToSearchHint");
            } else if (kClassB12.equals(reflectionFactory12.b(CameraSettings.class))) {
                JsonValue json12 = jsonValue.requireByKeyAsObject("textForPointAtBarcodesToSearchHint");
                Intrinsics.h(json12, "json");
                CameraSettings recommendedCameraSettings12 = json12.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json12._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings12, json12.jsonString());
                objFromJson12 = recommendedCameraSettings12;
            } else {
                if (!kClassB12.equals(reflectionFactory12.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson12 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForPointAtBarcodesToSearchHint"));
            }
            if (objFromJson12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str4 = (String) objFromJson12;
        } else {
            str4 = null;
        }
        if (str4 != null) {
            barcodeFindView.setTextForPointAtBarcodesToSearchHint(str4);
        }
        if (jsonValue.contains("textForMoveCloserToBarcodesHint")) {
            ReflectionFactory reflectionFactory13 = Reflection.f24268a;
            KClass kClassB13 = reflectionFactory13.b(String.class);
            if (kClassB13.equals(reflectionFactory13.b(BarcodeFindViewSettings.class))) {
                objFromJson13 = new T1().a(jsonValue.requireByKeyAsObject("textForMoveCloserToBarcodesHint"));
            } else if (kClassB13.equals(reflectionFactory13.b(cls))) {
                objFromJson13 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForMoveCloserToBarcodesHint"));
            } else if (kClassB13.equals(reflectionFactory13.b(String.class))) {
                objFromJson13 = jsonValue.requireByKeyAsString("textForMoveCloserToBarcodesHint");
            } else if (kClassB13.equals(reflectionFactory13.b(CameraSettings.class))) {
                JsonValue json13 = jsonValue.requireByKeyAsObject("textForMoveCloserToBarcodesHint");
                Intrinsics.h(json13, "json");
                CameraSettings recommendedCameraSettings13 = json13.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json13._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings13, json13.jsonString());
                objFromJson13 = recommendedCameraSettings13;
            } else {
                if (!kClassB13.equals(reflectionFactory13.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson13 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForMoveCloserToBarcodesHint"));
            }
            if (objFromJson13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str5 = (String) objFromJson13;
        } else {
            str5 = null;
        }
        if (str5 != null) {
            barcodeFindView.setTextForMoveCloserToBarcodesHint(str5);
        }
        if (jsonValue.contains("textForTapShutterToPauseScreenHint")) {
            ReflectionFactory reflectionFactory14 = Reflection.f24268a;
            KClass kClassB14 = reflectionFactory14.b(String.class);
            if (kClassB14.equals(reflectionFactory14.b(BarcodeFindViewSettings.class))) {
                objFromJson14 = new T1().a(jsonValue.requireByKeyAsObject("textForTapShutterToPauseScreenHint"));
            } else if (Intrinsics.c(kClassB14, reflectionFactory14.b(cls))) {
                objFromJson14 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForTapShutterToPauseScreenHint"));
            } else if (Intrinsics.c(kClassB14, reflectionFactory14.b(String.class))) {
                objFromJson14 = jsonValue.requireByKeyAsString("textForTapShutterToPauseScreenHint");
            } else if (Intrinsics.c(kClassB14, Reflection.a(CameraSettings.class))) {
                JsonValue json14 = jsonValue.requireByKeyAsObject("textForTapShutterToPauseScreenHint");
                Intrinsics.h(json14, "json");
                CameraSettings recommendedCameraSettings14 = json14.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json14._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings14, json14.jsonString());
                objFromJson14 = recommendedCameraSettings14;
            } else {
                if (!Intrinsics.c(kClassB14, Reflection.a(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson14 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForTapShutterToPauseScreenHint"));
            }
            if (objFromJson14 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str6 = (String) objFromJson14;
        } else {
            str6 = null;
        }
        if (str6 != null) {
            barcodeFindView.setTextForTapShutterToPauseScreenHint(str6);
        }
        if (jsonValue.contains("textForTapShutterToResumeSearchHint")) {
            KClass kClassA = Reflection.a(String.class);
            if (Intrinsics.c(kClassA, Reflection.a(BarcodeFindViewSettings.class))) {
                objFromJson15 = new T1().a(jsonValue.requireByKeyAsObject("textForTapShutterToResumeSearchHint"));
            } else if (Intrinsics.c(kClassA, Reflection.a(cls))) {
                objFromJson15 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForTapShutterToResumeSearchHint"));
            } else if (Intrinsics.c(kClassA, Reflection.a(String.class))) {
                objFromJson15 = jsonValue.requireByKeyAsString("textForTapShutterToResumeSearchHint");
            } else if (Intrinsics.c(kClassA, Reflection.a(CameraSettings.class))) {
                JsonValue json15 = jsonValue.requireByKeyAsObject("textForTapShutterToResumeSearchHint");
                Intrinsics.h(json15, "json");
                CameraSettings recommendedCameraSettings15 = json15.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json15._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings15, json15.jsonString());
                objFromJson15 = recommendedCameraSettings15;
            } else {
                if (!Intrinsics.c(kClassA, Reflection.a(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson15 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForTapShutterToResumeSearchHint"));
            }
            if (objFromJson15 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str7 = (String) objFromJson15;
        } else {
            str7 = null;
        }
        if (str7 != null) {
            barcodeFindView.setTextForTapShutterToResumeSearchHint(str7);
        }
        if (jsonValue.contains("textForItemListUpdatedHint")) {
            KClass kClassA2 = Reflection.a(String.class);
            if (Intrinsics.c(kClassA2, Reflection.a(BarcodeFindViewSettings.class))) {
                objFromJson16 = new T1().a(jsonValue.requireByKeyAsObject("textForItemListUpdatedHint"));
            } else if (Intrinsics.c(kClassA2, Reflection.a(cls))) {
                objFromJson16 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForItemListUpdatedHint"));
            } else if (Intrinsics.c(kClassA2, Reflection.a(String.class))) {
                objFromJson16 = jsonValue.requireByKeyAsString("textForItemListUpdatedHint");
            } else if (Intrinsics.c(kClassA2, Reflection.a(CameraSettings.class))) {
                JsonValue json16 = jsonValue.requireByKeyAsObject("textForItemListUpdatedHint");
                Intrinsics.h(json16, "json");
                CameraSettings recommendedCameraSettings16 = json16.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json16._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings16, json16.jsonString());
                objFromJson16 = recommendedCameraSettings16;
            } else {
                if (!Intrinsics.c(kClassA2, Reflection.a(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson16 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForItemListUpdatedHint"));
            }
            if (objFromJson16 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str8 = (String) objFromJson16;
        } else {
            str8 = null;
        }
        if (str8 != null) {
            barcodeFindView.setTextForItemListUpdatedHint(str8);
        }
        if (jsonValue.contains("textForItemListUpdatedWhenPausedHint")) {
            KClass kClassA3 = Reflection.a(String.class);
            if (Intrinsics.c(kClassA3, Reflection.a(BarcodeFindViewSettings.class))) {
                objFromJson17 = new T1().a(jsonValue.requireByKeyAsObject("textForItemListUpdatedWhenPausedHint"));
            } else if (Intrinsics.c(kClassA3, Reflection.a(cls))) {
                objFromJson17 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForItemListUpdatedWhenPausedHint"));
            } else if (Intrinsics.c(kClassA3, Reflection.a(String.class))) {
                objFromJson17 = jsonValue.requireByKeyAsString("textForItemListUpdatedWhenPausedHint");
            } else if (Intrinsics.c(kClassA3, Reflection.a(CameraSettings.class))) {
                JsonValue json17 = jsonValue.requireByKeyAsObject("textForItemListUpdatedWhenPausedHint");
                Intrinsics.h(json17, "json");
                CameraSettings recommendedCameraSettings17 = json17.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json17._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings17, json17.jsonString());
                objFromJson17 = recommendedCameraSettings17;
            } else {
                if (!Intrinsics.c(kClassA3, Reflection.a(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson17 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForItemListUpdatedWhenPausedHint"));
            }
            if (objFromJson17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str9 = (String) objFromJson17;
        } else {
            str9 = null;
        }
        if (str9 != null) {
            barcodeFindView.setTextForItemListUpdatedWhenPausedHint(str9);
        }
    }

    @NotNull
    public final List<String> getWarnings() {
        return this.f17670a;
    }

    public final void updateViewFromJson(@NotNull BarcodeFindView view, @NotNull String json) {
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        this.f17670a.clear();
        JsonValue jsonValue = new JsonValue(json);
        a(view, jsonValue);
        this.f17670a.addAll(jsonValue._getWarnings());
    }

    @NotNull
    public final BarcodeFindView viewFromJson(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull String json) {
        Object objFromJson;
        BarcodeFindViewSettings barcodeFindViewSettings;
        Object objFromJson2;
        CameraSettings recommendedCameraSettings;
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(barcodeFind, "barcodeFind");
        Intrinsics.h(json, "json");
        this.f17670a.clear();
        JsonValue jsonValue = new JsonValue(json);
        boolean zContains = jsonValue.contains("viewSettings");
        EmptyList emptyList = EmptyList.d;
        Class cls = Boolean.TYPE;
        if (zContains) {
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            KClass kClassB = reflectionFactory.b(BarcodeFindViewSettings.class);
            if (kClassB.equals(reflectionFactory.b(BarcodeFindViewSettings.class))) {
                objFromJson = new T1().a(jsonValue.requireByKeyAsObject("viewSettings"));
            } else if (kClassB.equals(reflectionFactory.b(cls))) {
                objFromJson = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("viewSettings"));
            } else if (kClassB.equals(reflectionFactory.b(String.class))) {
                objFromJson = jsonValue.requireByKeyAsString("viewSettings");
            } else if (kClassB.equals(reflectionFactory.b(CameraSettings.class))) {
                JsonValue json2 = jsonValue.requireByKeyAsObject("viewSettings");
                Intrinsics.h(json2, "json");
                CameraSettings recommendedCameraSettings2 = json2.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json2._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings2, json2.jsonString());
                objFromJson = recommendedCameraSettings2;
            } else {
                if (!kClassB.equals(reflectionFactory.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("viewSettings"));
            }
            if (objFromJson == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings");
            }
            barcodeFindViewSettings = (BarcodeFindViewSettings) objFromJson;
        } else {
            barcodeFindViewSettings = null;
        }
        if (barcodeFindViewSettings == null) {
            barcodeFindViewSettings = new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null);
        }
        if (jsonValue.contains("cameraSettings")) {
            ReflectionFactory reflectionFactory2 = Reflection.f24268a;
            KClass kClassB2 = reflectionFactory2.b(CameraSettings.class);
            if (kClassB2.equals(reflectionFactory2.b(BarcodeFindViewSettings.class))) {
                objFromJson2 = new T1().a(jsonValue.requireByKeyAsObject("cameraSettings"));
            } else if (kClassB2.equals(reflectionFactory2.b(cls))) {
                objFromJson2 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("cameraSettings"));
            } else if (kClassB2.equals(reflectionFactory2.b(String.class))) {
                objFromJson2 = jsonValue.requireByKeyAsString("cameraSettings");
            } else if (kClassB2.equals(reflectionFactory2.b(CameraSettings.class))) {
                JsonValue json3 = jsonValue.requireByKeyAsObject("cameraSettings");
                Intrinsics.h(json3, "json");
                CameraSettings recommendedCameraSettings3 = json3.getByKeyAsBoolean("usesRecommendedSettings", true) ? BarcodeFind.INSTANCE.getRecommendedCameraSettings() : new CameraSettings();
                json3._removeKeys(CollectionsKt.k("usesRecommendedSettings"));
                new FrameSourceDeserializer(emptyList).updateCameraSettingsFromJson(recommendedCameraSettings3, json3.jsonString());
                objFromJson2 = recommendedCameraSettings3;
            } else {
                if (!kClassB2.equals(reflectionFactory2.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson2 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("cameraSettings"));
            }
            if (objFromJson2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.core.source.CameraSettings");
            }
            recommendedCameraSettings = (CameraSettings) objFromJson2;
        } else {
            recommendedCameraSettings = null;
        }
        if (recommendedCameraSettings == null) {
            recommendedCameraSettings = BarcodeFind.INSTANCE.getRecommendedCameraSettings();
        }
        BarcodeFindView barcodeFindViewNewInstance = BarcodeFindView.INSTANCE.newInstance(parentView, dataCaptureContext, barcodeFind, barcodeFindViewSettings, recommendedCameraSettings);
        a(barcodeFindViewNewInstance, jsonValue);
        this.f17670a.addAll(jsonValue._getWarnings());
        return barcodeFindViewNewInstance;
    }
}
