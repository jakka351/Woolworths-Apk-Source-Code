package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSettings;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.capture.list.TargetBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.data.StructuredAppendData;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightType;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterHighlightType;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickIconStyle;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItem;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickIconStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickIconStyleKt;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeDefault;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeType;
import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayStyleKt;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyle;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyleKt;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverter;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverterFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ProxyConverterFactory(includes = {CoreNativeTypeFactory.class})
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0007J&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0002j\b\u0012\u0004\u0012\u00020\n`\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0007J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0002j\b\u0012\u0004\u0012\u00020\u000e`\u0004H\u0007J&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0002j\b\u0012\u0004\u0012\u00020\u000e`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0007J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0002j\b\u0012\u0004\u0012\u00020\u0012`\u0004H\u0007J&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0002j\b\u0012\u0004\u0012\u00020\u0012`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0007J8\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u00192\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012`\u0018H\u0007J&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001ej\b\u0012\u0004\u0012\u00020\u001c`\u001f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007J\u0010\u0010\r\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0012H\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\r\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020!H\u0007J\u0010\u0010\r\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020#H\u0007J8\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u00192\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e`\u0018H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007J\u0010\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\r\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020%H\u0007J\u0010\u0010\r\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020'H\u0007J&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020)0\u001ej\b\u0012\u0004\u0012\u00020)`\u001f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020)0\u001bH\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020*0\u0002j\b\u0012\u0004\u0012\u00020*`\u0004H\u0007J\u0010\u0010\r\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020*H\u0007J\u0010\u0010\r\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020,H\u0007JT\u0010\r\u001a4\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001e0\u0016j\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0\u001ej\b\u0012\u0004\u0012\u00020)`\u001f`\u00182\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001b0\u0019H\u0007J&\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020.0\u0002j\b\u0012\u0004\u0012\u00020.`\u0004H\u0007J&\u00101\u001a\u0012\u0012\u0004\u0012\u00020.0\u0002j\b\u0012\u0004\u0012\u00020.`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020/0\u0006H\u0007J&\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u0002020\u0002j\b\u0012\u0004\u0012\u000202`\u0004H\u0007J&\u00105\u001a\u0012\u0012\u0004\u0012\u0002020\u0002j\b\u0012\u0004\u0012\u000202`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002030\u0006H\u0007JT\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001b0\u001928\u0010\u0005\u001a4\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001e0\u0016j\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0\u001ej\b\u0012\u0004\u0012\u00020)`\u001f`\u0018H\u0007J\u0010\u0010\r\u001a\u0002082\u0006\u0010\u0005\u001a\u000207H\u0007J\u0010\u0010\r\u001a\u00020:2\u0006\u0010\u0005\u001a\u000209H\u0007J\u0010\u0010\r\u001a\u0002092\u0006\u0010\u0005\u001a\u00020:H\u0007J\u0010\u0010\r\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020;H\u0007J\u0010\u0010\r\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020<H\u0007J\u0010\u0010\r\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020=H\u0007J\u0010\u0010\r\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020>H\u0007J\u0010\u0010\r\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020?H\u0007J\u0010\u0010\r\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020@H\u0007J\u0010\u0010\r\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020AH\u0007J\u0010\u0010\r\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020BH\u0007J\u0010\u0010\r\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020CH\u0007J\u0010\u0010\r\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020DH\u0007J\u0010\u0010\r\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020EH\u0007J\u0010\u0010\r\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020FH\u0007J\u0010\u0010\r\u001a\u00020H2\u0006\u0010\u0005\u001a\u00020GH\u0007J\u0010\u0010\r\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020HH\u0007¨\u0006I"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/BarcodeNativeTypeFactory;", "", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "Lkotlin/collections/ArrayList;", "source", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "convertNativeBarcodeList", "convertBarcodeList", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "convertNativeLocalizedOnlyBarcode", "convert", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "convertNativeTrackedBarcodeList", "convertTrackedBarcodeList", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedObject;", "Lcom/scandit/datacapture/barcode/internal/module/tracking/capture/TrackedObject;", "convertNativeTrackedObjectList", "convertTrackedObjectList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "convertTrackedObjectNativeMap", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "src", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "convertSymbologySetToHashSet", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "convertProductProviderCallbackItemFromNativeImpl", "convertProductProviderCallbackItemToNativeImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "convertBarcodePickProductFromNativeImpl", "convertBarcodePickProductToNativeImpl", "convertMapOfSymbologyToSetOfInt", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickIconStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeNativeTypeFactory {

    @NotNull
    public static final BarcodeNativeTypeFactory INSTANCE = new BarcodeNativeTypeFactory();

    private BarcodeNativeTypeFactory() {
    }

    @ProxyConverter
    @NotNull
    public final LocalizedOnlyBarcode convert(@NotNull NativeLocalizedOnlyBarcode source) {
        Intrinsics.h(source, "source");
        return (LocalizedOnlyBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeLocalizedOnlyBarcode.class), null, source, new a(source));
    }

    @ProxyConverter
    @NotNull
    public final ArrayList<NativeBarcode> convertBarcodeList(@NotNull List<Barcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF17604a());
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    @NotNull
    public final List<BarcodePickProduct> convertBarcodePickProductFromNativeImpl(@NotNull ArrayList<NativeBarcodePickProduct> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(new BarcodePickProduct((NativeBarcodePickProduct) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final ArrayList<NativeBarcodePickProduct> convertBarcodePickProductToNativeImpl(@NotNull List<BarcodePickProduct> source) {
        Intrinsics.h(source, "source");
        ArrayList<NativeBarcodePickProduct> arrayList = new ArrayList<>();
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProduct) it.next()).get_impl());
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final Map<Symbology, Set<Short>> convertMapOfSymbologyToSetOfInt(@NotNull HashMap<Symbology, HashSet<Short>> source) {
        Intrinsics.h(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.L0((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    @NotNull
    public final List<Barcode> convertNativeBarcodeList(@NotNull ArrayList<NativeBarcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final List<LocalizedOnlyBarcode> convertNativeLocalizedOnlyBarcode(@NotNull ArrayList<NativeLocalizedOnlyBarcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeLocalizedOnlyBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final List<TrackedBarcode> convertNativeTrackedBarcodeList(@NotNull ArrayList<NativeTrackedBarcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTrackedBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final List<TrackedObject> convertNativeTrackedObjectList(@NotNull ArrayList<NativeTrackedObject> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTrackedObject) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final List<BarcodePickProductProviderCallbackItem> convertProductProviderCallbackItemFromNativeImpl(@NotNull ArrayList<NativeProductProviderCallbackItem> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(new BarcodePickProductProviderCallbackItem((NativeProductProviderCallbackItem) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final ArrayList<NativeProductProviderCallbackItem> convertProductProviderCallbackItemToNativeImpl(@NotNull List<BarcodePickProductProviderCallbackItem> source) {
        Intrinsics.h(source, "source");
        ArrayList<NativeProductProviderCallbackItem> arrayList = new ArrayList<>();
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProductProviderCallbackItem) it.next()).getF17915a());
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final HashSet<Symbology> convertSymbologySetToHashSet(@NotNull Set<? extends Symbology> src) {
        Intrinsics.h(src, "src");
        return CollectionsKt.E0(src);
    }

    @ProxyConverter
    @NotNull
    public final ArrayList<NativeTrackedBarcode> convertTrackedBarcodeList(@NotNull List<TrackedBarcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((TrackedBarcode) it.next()));
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    @NotNull
    public final ArrayList<NativeTrackedObject> convertTrackedObjectList(@NotNull List<TrackedObject> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((TrackedObject) it.next()).a());
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    @NotNull
    public final Map<Integer, TrackedObject> convertTrackedObjectNativeMap(@NotNull HashMap<Integer, NativeTrackedObject> source) {
        Intrinsics.h(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), INSTANCE.convert((NativeTrackedObject) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    @NotNull
    public final TrackedObject convert(@NotNull NativeTrackedObject source) {
        Intrinsics.h(source, "source");
        return (TrackedObject) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeTrackedObject.class), null, source, new b(source));
    }

    @ProxyConverter
    @NotNull
    public final Barcode convert(@NotNull NativeBarcode source) {
        Intrinsics.h(source, "source");
        return (Barcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeBarcode.class), null, source, new c(source));
    }

    @ProxyConverter
    @NotNull
    public final BarcodeCaptureSettings convert(@NotNull NativeBarcodeCaptureSettings source) {
        Intrinsics.h(source, "source");
        return new BarcodeCaptureSettings(source);
    }

    @ProxyConverter
    @NotNull
    public final BarcodeCapture convert(@NotNull NativeBarcodeCapture source) {
        Intrinsics.h(source, "source");
        return new BarcodeCapture(source, BatterySavingHandler.INSTANCE.defaultHandler(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
    }

    @ProxyConverter
    @NotNull
    public final NativeTrackedBarcode convert(@NotNull TrackedBarcode source) {
        Intrinsics.h(source, "source");
        return source.getF18191a();
    }

    @ProxyConverter
    @NotNull
    public final TrackedBarcode convert(@NotNull NativeTrackedBarcode source) {
        Intrinsics.h(source, "source");
        return (TrackedBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeTrackedBarcode.class), null, source, new d(source));
    }

    @ProxyConverter
    @NotNull
    public final SymbologySettings convert(@NotNull NativeSymbologySettings source) {
        Intrinsics.h(source, "source");
        return new SymbologySettings(source);
    }

    @ProxyConverter
    @NotNull
    public final StructuredAppendData convert(@NotNull NativeAbstractStructuredAppendData source) {
        Intrinsics.h(source, "source");
        return new StructuredAppendData(source);
    }

    @ProxyConverter
    @NotNull
    public final HashSet<Short> convert(@NotNull Set<Short> source) {
        Intrinsics.h(source, "source");
        return CollectionsKt.E0(source);
    }

    @ProxyConverter
    @NotNull
    public final TargetBarcode convert(@NotNull NativeTargetBarcode source) {
        Intrinsics.h(source, "source");
        return (TargetBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeTargetBarcode.class), null, source, new e(source));
    }

    @ProxyConverter
    @NotNull
    public final BarcodeFilterSettings convert(@NotNull NativeBarcodeFilterSettings source) {
        Intrinsics.h(source, "source");
        return new BarcodeFilterSettings(source);
    }

    @ProxyConverter
    @NotNull
    public final BarcodeCountViewStyle convert(@NotNull NativeBarcodeCountBasicOverlayStyle source) {
        Intrinsics.h(source, "source");
        return BarcodeCountViewStyleExtensionKt.toViewStyle(source);
    }

    @ProxyConverter
    @NotNull
    public final BarcodePickIconStyle convert(@NotNull NativeBarcodePickIconStyle source) {
        Intrinsics.h(source, "source");
        return BarcodePickIconStyleKt.toEnum(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodePickIconStyle convert(@NotNull BarcodePickIconStyle source) {
        Intrinsics.h(source, "source");
        return source._toNativeEnum$scandit_barcode_capture();
    }

    @ProxyConverter
    @NotNull
    public final BarcodePickState convert(@NotNull NativeBarcodePickState source) {
        Intrinsics.h(source, "source");
        return BarcodePickState.INSTANCE._fromNativeEnum$scandit_barcode_capture(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodePickState convert(@NotNull BarcodePickState source) {
        Intrinsics.h(source, "source");
        return source._toNativeEnum$scandit_barcode_capture();
    }

    @ProxyConverter
    @NotNull
    public final BarcodePick convert(@NotNull NativeBarcodePick source) {
        Intrinsics.h(source, "source");
        return ((BarcodePickInternal) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(NativeBarcodePick.class), null, source, new f(source))).e();
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodePick convert(@NotNull BarcodePick source) {
        Intrinsics.h(source, "source");
        return source._impl$scandit_barcode_capture();
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodeFilterOverlaySettings convert(@NotNull BarcodeFilterHighlightSettings source) {
        Intrinsics.h(source, "source");
        return source.getF17651a();
    }

    @ProxyConverter
    @NotNull
    public final BarcodeFilterHighlightSettings convert(@NotNull NativeBarcodeFilterOverlaySettings source) {
        Intrinsics.h(source, "source");
        return new BarcodeFilterHighlightSettings(source);
    }

    @ProxyConverter
    @NotNull
    public final BarcodeFilterHighlightType convert(@NotNull NativeBarcodeFilterHighlightType source) {
        Intrinsics.h(source, "source");
        return BarcodeFilterHighlightType.INSTANCE._fromNativeEnum$scandit_barcode_capture(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodeFilterHighlightType convert(@NotNull BarcodeFilterHighlightType source) {
        Intrinsics.h(source, "source");
        return source._toNativeEnum$scandit_barcode_capture();
    }

    @ProxyConverter
    @NotNull
    public final NativeSparkScanScanningMode convert(@NotNull SparkScanScanningMode source) {
        Intrinsics.h(source, "source");
        NativeSparkScanScanningBehavior nativeSparkScanScanningBehavior_toNativeEnum$scandit_barcode_capture = SparkScanScanningBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(SparkScanScanningModeKt.getScanningBehavior(source));
        NativeSparkScanPreviewBehavior nativeSparkScanPreviewBehavior_toNativeEnum$scandit_barcode_capture = SparkScanPreviewBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(SparkScanScanningModeKt.getPreviewBehavior(source));
        if (source instanceof SparkScanScanningMode.Target) {
            NativeSparkScanScanningMode nativeSparkScanScanningModeAsScanningMode = NativeSparkScanScanningModeTarget.create(nativeSparkScanScanningBehavior_toNativeEnum$scandit_barcode_capture, nativeSparkScanPreviewBehavior_toNativeEnum$scandit_barcode_capture).asScanningMode();
            Intrinsics.g(nativeSparkScanScanningModeAsScanningMode, "create(scanningBehavior,…        .asScanningMode()");
            return nativeSparkScanScanningModeAsScanningMode;
        }
        if (source instanceof SparkScanScanningMode.Default) {
            NativeSparkScanScanningMode nativeSparkScanScanningModeAsScanningMode2 = NativeSparkScanScanningModeDefault.create(nativeSparkScanScanningBehavior_toNativeEnum$scandit_barcode_capture, nativeSparkScanPreviewBehavior_toNativeEnum$scandit_barcode_capture).asScanningMode();
            Intrinsics.g(nativeSparkScanScanningModeAsScanningMode2, "create(scanningBehavior,…        .asScanningMode()");
            return nativeSparkScanScanningModeAsScanningMode2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ProxyConverter
    @NotNull
    public final SparkScanScanningMode convert(@NotNull NativeSparkScanScanningMode source) {
        Intrinsics.h(source, "source");
        SparkScanScanningBehavior.Companion companion = SparkScanScanningBehavior.INSTANCE;
        NativeSparkScanScanningBehavior scanningBehavior = source.getScanningBehavior();
        Intrinsics.g(scanningBehavior, "source.scanningBehavior");
        SparkScanScanningBehavior sparkScanScanningBehavior_fromNativeEnum$scandit_barcode_capture = companion._fromNativeEnum$scandit_barcode_capture(scanningBehavior);
        SparkScanPreviewBehavior.Companion companion2 = SparkScanPreviewBehavior.INSTANCE;
        NativeSparkScanPreviewBehavior previewBehavior = source.getPreviewBehavior();
        Intrinsics.g(previewBehavior, "source.previewBehavior");
        SparkScanPreviewBehavior sparkScanPreviewBehavior_fromNativeEnum$scandit_barcode_capture = companion2._fromNativeEnum$scandit_barcode_capture(previewBehavior);
        if (source.getType() == NativeSparkScanScanningModeType.DEFAULT) {
            return new SparkScanScanningMode.Default(sparkScanScanningBehavior_fromNativeEnum$scandit_barcode_capture, sparkScanPreviewBehavior_fromNativeEnum$scandit_barcode_capture);
        }
        return new SparkScanScanningMode.Target(sparkScanScanningBehavior_fromNativeEnum$scandit_barcode_capture, sparkScanPreviewBehavior_fromNativeEnum$scandit_barcode_capture);
    }

    @ProxyConverter
    @NotNull
    public final BarcodeTrackingBasicOverlayStyle convert(@NotNull NativeBarcodeTrackingBasicOverlayStyle source) {
        Intrinsics.h(source, "source");
        return BarcodeTrackingBasicOverlayStyleKt.fromNative(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodeTrackingBasicOverlayStyle convert(@NotNull BarcodeTrackingBasicOverlayStyle source) {
        Intrinsics.h(source, "source");
        return BarcodeTrackingBasicOverlayStyleKt.toNative(source);
    }

    @ProxyConverter
    @NotNull
    public final BarcodeCaptureOverlayStyle convert(@NotNull NativeBarcodeCaptureOverlayStyle source) {
        Intrinsics.h(source, "source");
        return BarcodeCaptureOverlayStyleKt.fromNative(source);
    }

    @ProxyConverter
    @NotNull
    public final NativeBarcodeCaptureOverlayStyle convert(@NotNull BarcodeCaptureOverlayStyle source) {
        Intrinsics.h(source, "source");
        return BarcodeCaptureOverlayStyleKt.toNative(source);
    }

    @ProxyConverter
    @NotNull
    public final Map<Integer, TrackedBarcode> convert(@NotNull HashMap<Integer, NativeTrackedBarcode> source) {
        Intrinsics.h(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), INSTANCE.convert((NativeTrackedBarcode) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    @NotNull
    public final List<TargetBarcode> convert(@NotNull ArrayList<NativeTargetBarcode> source) {
        Intrinsics.h(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTargetBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    @NotNull
    public final HashMap<Symbology, HashSet<Short>> convert(@NotNull Map<Symbology, ? extends Set<Short>> source) {
        Intrinsics.h(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.E0((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }
}
