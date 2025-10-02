package com.scandit.datacapture.core.capture.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.component.serialization.DataCaptureComponentDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializer;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u000234B=\b\u0000\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0016\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0016\u0012\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u00101B5\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0016\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0016¢\u0006\u0004\b0\u00102J\t\u0010\u0002\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0097\u0001J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0097\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0097\u0001J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ.\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u000eR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00065"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxy;", "_deserializer", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "_impl", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "", "jsonData", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "contextFromJson", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "components", "updateContextFromJson", "g", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;)V", "", "<set-?>", "getAvoidThreadDependencies", "()Z", "setAvoidThreadDependencies", "(Z)V", "avoidThreadDependencies", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "frameSourceDeserializer", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "viewDeserializer", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Lcom/scandit/datacapture/core/component/serialization/DataCaptureComponentDeserializer;", "componentDeserializers", "impl", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;Ljava/util/List;Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;)V", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;Ljava/util/List;Ljava/util/List;)V", "com/scandit/datacapture/core/capture/serialization/a", "com/scandit/datacapture/core/capture/serialization/b", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializer implements DataCaptureContextDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializer f18448a;
    private final DataCaptureViewDeserializer b;
    private final List c;
    private final List d;
    private final /* synthetic */ DataCaptureContextDeserializerProxyAdapter e;
    private final b f;

    /* renamed from: g, reason: from kotlin metadata */
    private DataCaptureContextDeserializerListener listener;

    public DataCaptureContextDeserializer(@NotNull FrameSourceDeserializer frameSourceDeserializer, @NotNull DataCaptureViewDeserializer viewDeserializer, @NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers, @NotNull List<? extends DataCaptureComponentDeserializer> componentDeserializers, @NotNull NativeDataCaptureContextDeserializer impl) {
        Intrinsics.h(frameSourceDeserializer, "frameSourceDeserializer");
        Intrinsics.h(viewDeserializer, "viewDeserializer");
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        Intrinsics.h(componentDeserializers, "componentDeserializers");
        Intrinsics.h(impl, "impl");
        this.f18448a = frameSourceDeserializer;
        this.b = viewDeserializer;
        this.c = modeDeserializers;
        this.d = componentDeserializers;
        this.e = new DataCaptureContextDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        b bVar = new b(frameSourceDeserializer);
        this.f = bVar;
        _setDeserializer(this);
        _setHelper(bVar);
        impl.setListener(new DataCaptureContextDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public DataCaptureContextDeserializer _deserializer() {
        return this.e._deserializer();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureContextDeserializer getF18451a() {
        return this.e.getF18451a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull DataCaptureContextDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.e._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(@Nullable DataCaptureContextDeserializerHelper helper) {
        this.e._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(@Nullable DataCaptureContextDeserializerListener listener) {
        this.e._setListener(listener);
    }

    @NotNull
    public final DataCaptureContextDeserializerResult contextFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeDataCaptureContextDeserializerResult result = getF18451a().contextFromJson(new JsonValue(jsonData).getF18778a());
        DataCaptureContext dataCaptureContextA = this.f.a();
        DataCaptureView deserializedView = this.b.get_helper().getDeserializedView();
        if (dataCaptureContextA == null) {
            throw new AssertionError("Null deserializedContext");
        }
        Intrinsics.g(result, "result");
        DataCaptureContextDeserializerResult dataCaptureContextDeserializerResult = new DataCaptureContextDeserializerResult(result, dataCaptureContextA, deserializedView);
        this.f.clear();
        this.f18448a.get_helper().clear();
        this.b.get_helper().clear();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((DataCaptureModeDeserializer) it.next()).get_helper().clear();
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((DataCaptureComponentDeserializer) it2.next()).get_helper().clear();
        }
        return dataCaptureContextDeserializerResult;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(property = "avoidThreadDependencies")
    public boolean getAvoidThreadDependencies() {
        return this.e.getAvoidThreadDependencies();
    }

    @Nullable
    public final DataCaptureContextDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @ProxyFunction(property = "avoidThreadDependencies")
    public void setAvoidThreadDependencies(boolean z) {
        this.e.setAvoidThreadDependencies(z);
    }

    public final void setListener(@Nullable DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener) {
        this.listener = dataCaptureContextDeserializerListener;
    }

    @NotNull
    public final DataCaptureContextDeserializerResult updateContextFromJson(@NotNull DataCaptureContext dataCaptureContext, @Nullable DataCaptureView view, @NotNull List<? extends DataCaptureComponent> components, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(components, "components");
        Intrinsics.h(jsonData, "jsonData");
        GuavaMapMakerProxyCache globalProxyCache = ProxyCacheKt.getGlobalProxyCache();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        NativeDataCaptureView nativeDataCaptureView_impl = null;
        globalProxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, dataCaptureContext._impl(), dataCaptureContext);
        if (view != null) {
            ProxyCacheKt.getGlobalProxyCache().put(reflectionFactory.b(NativeDataCaptureView.class), null, view._impl(), view);
            nativeDataCaptureView_impl = view._impl();
        }
        NativeDataCaptureContextDeserializer f18451a = getF18451a();
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext._impl();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureComponent) it.next()).getC());
        }
        NativeDataCaptureContextDeserializerResult result = f18451a.updateContextFromJson(nativeDataCaptureContext_impl, nativeDataCaptureView_impl, new ArrayList<>(arrayList), new JsonValue(jsonData).getF18778a());
        if (view == null) {
            view = this.b.get_helper().getDeserializedView();
        }
        Intrinsics.g(result, "result");
        DataCaptureContextDeserializerResult dataCaptureContextDeserializerResult = new DataCaptureContextDeserializerResult(result, dataCaptureContext, view);
        this.f.clear();
        this.f18448a.get_helper().clear();
        this.b.get_helper().clear();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((DataCaptureModeDeserializer) it2.next()).get_helper().clear();
        }
        Iterator it3 = this.d.iterator();
        while (it3.hasNext()) {
            ((DataCaptureComponentDeserializer) it3.next()).get_helper().clear();
        }
        return dataCaptureContextDeserializerResult;
    }

    public DataCaptureContextDeserializer(@NotNull FrameSourceDeserializer frameSourceDeserializer, @NotNull DataCaptureViewDeserializer viewDeserializer, @NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers, @NotNull List<? extends DataCaptureComponentDeserializer> componentDeserializers) {
        Intrinsics.h(frameSourceDeserializer, "frameSourceDeserializer");
        Intrinsics.h(viewDeserializer, "viewDeserializer");
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        Intrinsics.h(componentDeserializers, "componentDeserializers");
        NativeFrameSourceDeserializer f18860a = frameSourceDeserializer.getF18860a();
        NativeDataCaptureViewDeserializer f18941a = viewDeserializer.getF18941a();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next()).getC());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(componentDeserializers, 10));
        Iterator<T> it2 = componentDeserializers.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((DataCaptureComponentDeserializer) it2.next())._componentDeserializerImpl());
        }
        NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializerCreate = NativeDataCaptureContextDeserializer.create(f18860a, f18941a, arrayList2, new ArrayList(arrayList3));
        Intrinsics.g(nativeDataCaptureContextDeserializerCreate, "create(\n            fram…alizerImpl() })\n        )");
        this(frameSourceDeserializer, viewDeserializer, modeDeserializers, componentDeserializers, nativeDataCaptureContextDeserializerCreate);
    }
}
