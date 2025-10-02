package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResult;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResultProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;", "_impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "a", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "b", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "getView", "()Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "getComponents", "()Ljava/util/List;", "components", "", "getWarnings", "warnings", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializerResult implements DataCaptureContextDeserializerResultProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DataCaptureContext dataCaptureContext;

    /* renamed from: b, reason: from kotlin metadata */
    private final DataCaptureView view;
    private final /* synthetic */ DataCaptureContextDeserializerResultProxyAdapter c;

    public DataCaptureContextDeserializerResult(@NotNull NativeDataCaptureContextDeserializerResult impl, @NotNull DataCaptureContext dataCaptureContext, @Nullable DataCaptureView dataCaptureView) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.dataCaptureContext = dataCaptureContext;
        this.view = dataCaptureView;
        this.c = new DataCaptureContextDeserializerResultProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureContextDeserializerResult getF18453a() {
        return this.c.getF18453a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @ProxyFunction(property = "components")
    @NotNull
    public List<DataCaptureComponent> getComponents() {
        return this.c.getComponents();
    }

    @NotNull
    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    @Nullable
    public final DataCaptureView getView() {
        return this.view;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.c.getWarnings();
    }
}
