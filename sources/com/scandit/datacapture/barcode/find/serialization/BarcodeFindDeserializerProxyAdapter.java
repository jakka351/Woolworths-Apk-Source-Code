package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "", "json", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "_modeFromJson", "mode", "_updateModeFromJson", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "_settingsFromJson", "settings", "_updateSettingsFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "_helper", "_NativeBarcodeFindDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFindDeserializerProxyAdapter implements BarcodeFindDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFindDeserializer f17669a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;

    public BarcodeFindDeserializerProxyAdapter(@NotNull NativeBarcodeFindDeserializer _NativeBarcodeFindDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFindDeserializer, "_NativeBarcodeFindDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17669a = _NativeBarcodeFindDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeFindDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodeFindDeseri…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFindDeserializer getF17669a() {
        return this.f17669a;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NotNull
    public BarcodeFind _modeFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodeFind _1 = this.f17669a.barcodeFindFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeFind.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeFind) proxyCache.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NotNull
    public BarcodeFindSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodeFindSettings _1 = this.f17669a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeFindSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeFindSettings) proxyCache.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NotNull
    public BarcodeFind _updateModeFromJson(@NotNull BarcodeFind mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        NativeBarcodeFind nativeBarcodeFind_impl = mode.getF17661a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeFind.class), null, nativeBarcodeFind_impl, mode);
        NativeBarcodeFind _2 = this.f17669a.updateBarcodeFindFromJson(nativeBarcodeFind_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeFind.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeFind) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NotNull
    public BarcodeFindSettings _updateSettingsFromJson(@NotNull BarcodeFindSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        NativeBarcodeFindSettings nativeBarcodeFindSettings_impl = settings.getF17663a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeFindSettings.class), null, nativeBarcodeFindSettings_impl, settings);
        NativeBarcodeFindSettings _2 = this.f17669a.updateSettingsFromJson(nativeBarcodeFindSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeFindSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeFindSettings) proxyCache2.require(kClassB, null, _2);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeFindDeserializerHelper get_helper() {
        return (BarcodeFindDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodeFindDeserializerHelper.class), this.f17669a.getHelper());
    }

    public /* synthetic */ BarcodeFindDeserializerProxyAdapter(NativeBarcodeFindDeserializer nativeBarcodeFindDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFindDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
