package com.scandit.datacapture.barcode.generator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorFactoryResult;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorGenerateResult;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorOptions;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorSymbology;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.common.graphic.ImagePlane;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\n\u0016\u0017\u0018\u0019\u0015\u001a\u001b\u001c\u001d\u001eB\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0011\u001a\u00020\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator;", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxy;", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_dataCaptureComponentImpl", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "_impl", "", "data", "", "imageWidth", "Landroid/graphics/Bitmap;", "generate", "", TextBundle.TEXT_ENTRY, "getId", "()Ljava/lang/String;", "id", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;)V", "Companion", "AztecBarcodeGeneratorBuilder", "BarcodeGeneratorBuilder", "Code128BarcodeGeneratorBuilder", "Code39BarcodeGeneratorBuilder", "DataMatrixBarcodeGeneratorBuilder", "Ean13BarcodeGeneratorBuilder", "InterleavedTwoOfFiveBarcodeGeneratorBuilder", "QrCodeBarcodeGeneratorBuilder", "UpcaBarcodeGeneratorBuilder", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeGenerator implements DataCaptureComponent, BarcodeGeneratorProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeGeneratorProxyAdapter f17685a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "withLayers", "layers", "", "(Ljava/lang/Integer;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "withMinimumErrorCorrectionPercent", "minimumErrorCorrectionPercent", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AztecBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<QrCodeBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AztecBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.AZTEC);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }

        @NotNull
        public final AztecBarcodeGeneratorBuilder withLayers(@Nullable Integer layers) {
            getOptions().setLayers$scandit_barcode_capture(layers);
            return this;
        }

        @NotNull
        public final AztecBarcodeGeneratorBuilder withMinimumErrorCorrectionPercent(@Nullable Integer minimumErrorCorrectionPercent) {
            getOptions().setMinimumErrorCorrectionPercent$scandit_barcode_capture(minimumErrorCorrectionPercent);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "BuilderType", "", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator;", "build", "", "backgroundColor", "withBackgroundColor", "(I)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "foregroundColor", "withForegroundColor", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "c", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "getOptions$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "options", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorSymbology;", "symbology", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorSymbology;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static abstract class BarcodeGeneratorBuilder<BuilderType extends BarcodeGeneratorBuilder<? extends BuilderType>> {

        /* renamed from: a, reason: collision with root package name */
        private final DataCaptureContext f17686a;
        private final NativeBarcodeGeneratorSymbology b;

        /* renamed from: c, reason: from kotlin metadata */
        private final BarcodeGeneratorOptions options;

        public BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext, @NotNull NativeBarcodeGeneratorSymbology symbology) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(symbology, "symbology");
            this.f17686a = dataCaptureContext;
            this.b = symbology;
            this.options = Companion.access$createDefaultOptions(BarcodeGenerator.INSTANCE, symbology);
        }

        @NotNull
        public final BarcodeGenerator build() {
            return Companion.access$create(BarcodeGenerator.INSTANCE, this.f17686a, this.b, this.options);
        }

        @NotNull
        /* renamed from: getOptions$scandit_barcode_capture, reason: from getter */
        public final BarcodeGeneratorOptions getOptions() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BuilderType withBackgroundColor(int backgroundColor) {
            this.options.setBackgroundColor$scandit_barcode_capture(Integer.valueOf(backgroundColor));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BuilderType withForegroundColor(int foregroundColor) {
            this.options.setForegroundColor$scandit_barcode_capture(Integer.valueOf(foregroundColor));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code128BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Code128BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Code128BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code128BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.CODE128);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code39BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Code39BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Code39BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code39BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.CODE39);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code39BarcodeGeneratorBuilder;", "code39BarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code128BarcodeGeneratorBuilder;", "code128BarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Ean13BarcodeGeneratorBuilder;", "ean13BarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$UpcaBarcodeGeneratorBuilder;", "upcaBarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$InterleavedTwoOfFiveBarcodeGeneratorBuilder;", "interleavedTwoOfFiveBarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "qrCodeBarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$DataMatrixBarcodeGeneratorBuilder;", "dataMatrixBarcodeGeneratorBuilder", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "aztecBarcodeGeneratorBuilder", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final BarcodeGenerator access$create(Companion companion, DataCaptureContext dataCaptureContext, NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology, BarcodeGeneratorOptions barcodeGeneratorOptions) {
            companion.getClass();
            NativeBarcodeGeneratorFactoryResult nativeBarcodeGeneratorFactoryResultCreate = NativeBarcodeGenerator.create(dataCaptureContext.getF18429a(), nativeBarcodeGeneratorSymbology, BarcodeGeneratorKt.toNativeOptions(barcodeGeneratorOptions));
            Intrinsics.g(nativeBarcodeGeneratorFactoryResultCreate, "create(\n                …tions()\n                )");
            if (!nativeBarcodeGeneratorFactoryResultCreate.ok()) {
                throw new InvalidParameterException(nativeBarcodeGeneratorFactoryResultCreate.error());
            }
            NativeBarcodeGenerator nativeBarcodeGeneratorValue = nativeBarcodeGeneratorFactoryResultCreate.value();
            Intrinsics.g(nativeBarcodeGeneratorValue, "native.value()");
            return new BarcodeGenerator(nativeBarcodeGeneratorValue);
        }

        public static final BarcodeGeneratorOptions access$createDefaultOptions(Companion companion, NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology) {
            companion.getClass();
            NativeBarcodeGeneratorOptions nativeBarcodeGeneratorOptionsCreateDefaultOptions = NativeBarcodeGenerator.createDefaultOptions(nativeBarcodeGeneratorSymbology);
            Intrinsics.g(nativeBarcodeGeneratorOptionsCreateDefaultOptions, "createDefaultOptions(symbology)");
            return BarcodeGeneratorKt.access$toApi(nativeBarcodeGeneratorOptionsCreateDefaultOptions);
        }

        @JvmStatic
        @NotNull
        public final AztecBarcodeGeneratorBuilder aztecBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new AztecBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final Code128BarcodeGeneratorBuilder code128BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new Code128BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final Code39BarcodeGeneratorBuilder code39BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new Code39BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final DataMatrixBarcodeGeneratorBuilder dataMatrixBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new DataMatrixBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final Ean13BarcodeGeneratorBuilder ean13BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new Ean13BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final InterleavedTwoOfFiveBarcodeGeneratorBuilder interleavedTwoOfFiveBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new InterleavedTwoOfFiveBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final QrCodeBarcodeGeneratorBuilder qrCodeBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new QrCodeBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        @NotNull
        public final UpcaBarcodeGeneratorBuilder upcaBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            return new UpcaBarcodeGeneratorBuilder(dataCaptureContext);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$DataMatrixBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataMatrixBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<DataMatrixBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataMatrixBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.DATA_MATRIX);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Ean13BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ean13BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Ean13BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ean13BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.EAN13);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$InterleavedTwoOfFiveBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InterleavedTwoOfFiveBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<InterleavedTwoOfFiveBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterleavedTwoOfFiveBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.INTERLEAVED_TWO_OF_FIVE);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "withErrorCorrectionLevel", "errorCorrectionLevel", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "withVersionNumber", "versionNumber", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class QrCodeBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<QrCodeBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrCodeBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.QR);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }

        @NotNull
        public final QrCodeBarcodeGeneratorBuilder withErrorCorrectionLevel(@NotNull QrCodeErrorCorrectionLevel errorCorrectionLevel) {
            Intrinsics.h(errorCorrectionLevel, "errorCorrectionLevel");
            getOptions().setErrorCorrectionLevel$scandit_barcode_capture(errorCorrectionLevel);
            return this;
        }

        @NotNull
        public final QrCodeBarcodeGeneratorBuilder withVersionNumber(int versionNumber) {
            getOptions().setVersionNumber$scandit_barcode_capture(Integer.valueOf(versionNumber));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$UpcaBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpcaBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<UpcaBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpcaBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.UPCA);
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }
    }

    public BarcodeGenerator(@NotNull NativeBarcodeGenerator impl) {
        Intrinsics.h(impl, "impl");
        this.f17685a = new BarcodeGeneratorProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final AztecBarcodeGeneratorBuilder aztecBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.aztecBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final Code128BarcodeGeneratorBuilder code128BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.code128BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final Code39BarcodeGeneratorBuilder code39BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.code39BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final DataMatrixBarcodeGeneratorBuilder dataMatrixBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.dataMatrixBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final Ean13BarcodeGeneratorBuilder ean13BarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.ean13BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final InterleavedTwoOfFiveBarcodeGeneratorBuilder interleavedTwoOfFiveBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.interleavedTwoOfFiveBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final QrCodeBarcodeGeneratorBuilder qrCodeBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.qrCodeBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    @NotNull
    public static final UpcaBarcodeGeneratorBuilder upcaBarcodeGeneratorBuilder(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.upcaBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureComponentImpl */
    public NativeDataCaptureComponent getC() {
        return this.f17685a.getC();
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeGenerator getF17688a() {
        return this.f17685a.getF17688a();
    }

    @NotNull
    public final Bitmap generate(@NotNull byte[] data, int imageWidth) {
        Intrinsics.h(data, "data");
        NativeBarcodeGeneratorGenerateResult nativeBarcodeGeneratorGenerateResultGenerate = getF17688a().generate(data, CollectionsExtensionsKt.toArrayList(EmptyList.d));
        if (!nativeBarcodeGeneratorGenerateResultGenerate.ok()) {
            String errorMessage = nativeBarcodeGeneratorGenerateResultGenerate.error();
            Intrinsics.g(errorMessage, "errorMessage");
            if (StringsKt.o(errorMessage, "Invalid input", true)) {
                throw new IllegalArgumentException(errorMessage);
            }
            throw new RuntimeException(errorMessage);
        }
        NativeImageBuffer imageBuffer = nativeBarcodeGeneratorGenerateResultGenerate.value().getImageBuffer();
        int width = imageBuffer.getWidth();
        int height = imageBuffer.getHeight();
        ArrayList<ImagePlane> planes = imageBuffer.getPlanes();
        Intrinsics.g(planes, "nativeBuffer.planes");
        ImageBuffer imageBuffer2 = new ImageBuffer(width, height, planes);
        if (imageWidth == imageBuffer2.getWidth()) {
            return imageBuffer2.toBitmap();
        }
        if (imageWidth <= 0) {
            throw new IllegalStateException("Image width should be bigger than zero!");
        }
        int width2 = (int) (imageWidth / (imageBuffer2.getWidth() / imageBuffer2.getHeight()));
        if (imageWidth < imageBuffer2.getWidth()) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(imageBuffer2.toBitmap(), imageWidth, width2, true);
            Intrinsics.g(bitmapCreateScaledBitmap, "createScaledBitmap(\n    …       true\n            )");
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapAccess$toBitmap = BarcodeGeneratorKt.access$toBitmap(imageBuffer2, imageWidth, width2);
        int iCeil = (int) Math.ceil(r2 / imageBuffer2.getWidth());
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapAccess$toBitmap, imageBuffer2.getWidth() * iCeil, imageBuffer2.getHeight() * iCeil, false);
        bitmapAccess$toBitmap.reconfigure(imageWidth, width2, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        new Canvas(bitmapAccess$toBitmap).drawBitmap(bitmapCreateScaledBitmap2, (Rect) null, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapAccess$toBitmap.getWidth(), bitmapAccess$toBitmap.getHeight()), paint);
        bitmapCreateScaledBitmap2.recycle();
        return bitmapAccess$toBitmap;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @ProxyFunction(nativeName = "getIdentifier", property = "id")
    @NotNull
    public String getId() {
        return this.f17685a.getId();
    }

    @NotNull
    public final Bitmap generate(@NotNull String text, int imageWidth) {
        Intrinsics.h(text, "text");
        byte[] bytes = text.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        return generate(bytes, imageWidth);
    }
}
