package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0097\u0001J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\f\u001a\u0004\u0018\u00010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;", "_impl", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "helper", "", "_setHelper", "", "jsonData", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "viewfinderFromJson", "_getAndResetLastViewfinder", "", "getWarnings", "()Ljava/util/List;", "warnings", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;)V", "()V", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class ViewfinderDeserializer implements ViewfinderDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ViewfinderDeserializerProxyAdapter f18972a;
    private final Helper b;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer$Helper;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "createNoViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "createLaserlineViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "createRectangularViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinder;", "createSpotlightViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "createAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinder;", "createCombinedViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "createTargetAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "a", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "setViewfinder", "(Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "viewfinder", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Helper implements ViewfinderDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Viewfinder viewfinder;

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public AimerViewfinder createAimerViewfinder() {
            AimerViewfinder aimerViewfinder = new AimerViewfinder();
            this.viewfinder = aimerViewfinder;
            return aimerViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public CombinedViewfinder createCombinedViewfinder() {
            CombinedViewfinder combinedViewfinder = new CombinedViewfinder();
            this.viewfinder = combinedViewfinder;
            return combinedViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public LaserlineViewfinder createLaserlineViewfinder(@NotNull LaserlineViewfinderStyle style) {
            Intrinsics.h(style, "style");
            LaserlineViewfinder laserlineViewfinder = new LaserlineViewfinder(style);
            this.viewfinder = laserlineViewfinder;
            return laserlineViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public NoViewfinder createNoViewfinder() {
            NoViewfinder noViewfinder = new NoViewfinder();
            this.viewfinder = noViewfinder;
            return noViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public RectangularViewfinder createRectangularViewfinder(@NotNull RectangularViewfinderStyle style, @NotNull RectangularViewfinderLineStyle lineStyle) {
            Intrinsics.h(style, "style");
            Intrinsics.h(lineStyle, "lineStyle");
            RectangularViewfinder rectangularViewfinder = new RectangularViewfinder(style, lineStyle);
            this.viewfinder = rectangularViewfinder;
            return rectangularViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public SpotlightViewfinder createSpotlightViewfinder() {
            SpotlightViewfinder spotlightViewfinder = new SpotlightViewfinder();
            this.viewfinder = spotlightViewfinder;
            return spotlightViewfinder;
        }

        @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerHelper
        @NotNull
        public TargetAimerViewfinder createTargetAimerViewfinder() {
            TargetAimerViewfinder targetAimerViewfinder = new TargetAimerViewfinder();
            this.viewfinder = targetAimerViewfinder;
            return targetAimerViewfinder;
        }

        @Nullable
        public final Viewfinder getViewfinder() {
            return this.viewfinder;
        }

        public final void setViewfinder(@Nullable Viewfinder viewfinder) {
            this.viewfinder = viewfinder;
        }
    }

    public ViewfinderDeserializer(@NotNull NativeViewfinderDeserializer impl) {
        Intrinsics.h(impl, "impl");
        this.f18972a = new ViewfinderDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this.b = helper;
        _setHelper(helper);
    }

    @Nullable
    public final Viewfinder _getAndResetLastViewfinder() {
        Viewfinder viewfinder = this.b.getViewfinder();
        this.b.setViewfinder(null);
        return viewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeViewfinderDeserializer getF18975a() {
        return this.f18972a.getF18975a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(@Nullable ViewfinderDeserializerHelper helper) {
        this.f18972a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.f18972a.getWarnings();
    }

    @NotNull
    public final Viewfinder viewfinderFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        _getAndResetLastViewfinder();
        getF18975a().viewfinderFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        Viewfinder viewfinder_getAndResetLastViewfinder = _getAndResetLastViewfinder();
        if (viewfinder_getAndResetLastViewfinder != null) {
            return viewfinder_getAndResetLastViewfinder;
        }
        throw new IllegalStateException("No Java viewfinder was created during deserialization");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewfinderDeserializer() {
        NativeViewfinderDeserializer nativeViewfinderDeserializerCreate = NativeViewfinderDeserializer.create();
        Intrinsics.g(nativeViewfinderDeserializerCreate, "create()");
        this(nativeViewfinderDeserializerCreate);
    }
}
