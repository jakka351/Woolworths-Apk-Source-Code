package me.oriient.ipssdk.realtime.debugInfo;

import com.salesforce.marketingcloud.messages.iam.j;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableBoolean;
import me.oriient.internal.infra.serializerJson.JsonableNumber;
import me.oriient.internal.infra.serializerJson.JsonableString;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.B1;
import me.oriient.ipssdk.realtime.ofs.C1;
import me.oriient.ipssdk.realtime.ofs.C1742w1;
import me.oriient.positioningengine.common.PDRClassification;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lme/oriient/ipssdk/realtime/debugInfo/DebugInfoManagerImpl;", "Lme/oriient/ipssdk/realtime/debugInfo/DebugInfoManager;", "<init>", "()V", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "uploaderItem", "", "onNewUploaderItem", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)V", "clean", "", "value", "d", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDebugInfo", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "debugInfo", "Companion", "me/oriient/ipssdk/realtime/ofs/C1", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DebugInfoManagerImpl implements DebugInfoManager {

    @NotNull
    private static final C1 Companion = new C1();

    @Deprecated
    @NotNull
    public static final String TAG = "DebugInfoManager";

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25811a;
    private final Lazy b;
    private final Lazy c;

    /* renamed from: d, reason: from kotlin metadata */
    private boolean isEnabled;

    /* renamed from: e, reason: from kotlin metadata */
    private final MutableStateFlow debugInfo;
    private List f;

    public DebugInfoManagerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25811a = di.inject(reflectionFactory.b(Logger.class));
        ContextScope contextScopeA = CoroutineScopeKt.a(SupervisorKt.b());
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportEngineUploadManager.class));
        BuildersKt.c(contextScopeA, null, null, new C1742w1(this, null), 3);
        BuildersKt.c(contextScopeA, null, null, new B1(this, null), 3);
        this.debugInfo = StateFlowKt.a(EmptyMap.d);
        this.f = EmptyList.d;
    }

    public static final SupportPositioningEngineManager access$getEngineManager(DebugInfoManagerImpl debugInfoManagerImpl) {
        return (SupportPositioningEngineManager) debugInfoManagerImpl.b.getD();
    }

    public static final SupportEngineUploadManager access$getUploadManager(DebugInfoManagerImpl debugInfoManagerImpl) {
        return (SupportEngineUploadManager) debugInfoManagerImpl.c.getD();
    }

    public static final void access$updatePDRClassification(DebugInfoManagerImpl debugInfoManagerImpl, PDRClassification pDRClassification) {
        if (debugInfoManagerImpl.getIsEnabled()) {
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("inHand", JsonHelpersKt.toJsonableNumber(pDRClassification.getInHand())), new Pair("onCart", JsonHelpersKt.toJsonableNumber(pDRClassification.getOnCart())), new Pair("withCart", JsonHelpersKt.toJsonableNumber(pDRClassification.getWithCart())), new Pair("accuracyX", JsonHelpersKt.toJsonableNumber(pDRClassification.getAccuracyX())), new Pair("accuracyY", JsonHelpersKt.toJsonableNumber(pDRClassification.getAccuracyY())));
            MutableStateFlow<Map<String, Jsonable>> debugInfo = debugInfoManagerImpl.getDebugInfo();
            debugInfo.setValue(MapsKt.m((Map) debugInfo.getValue(), MapsKt.i(new Pair("pdrClassification", JsonHelpersKt.toJsonableMap(linkedHashMapL)))));
        }
    }

    @Override // me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager
    public void clean() {
        if (getIsEnabled()) {
            this.f = EmptyList.d;
            getDebugInfo().setValue(EmptyMap.d);
        }
    }

    @Override // me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager
    /* renamed from: isEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager
    public void onNewUploaderItem(@NotNull DataUploaderItem uploaderItem) {
        Intrinsics.h(uploaderItem, "uploaderItem");
        if (getIsEnabled()) {
            Pair pair = new Pair("sessionId", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(uploaderItem.getSessionId())));
            Pair pair2 = new Pair("dataType", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(uploaderItem.getDataType().getStrValue())));
            String endReason = uploaderItem.getEndReason();
            if (endReason == null) {
                endReason = j.h;
            }
            AbstractMap abstractMapF = MapsKt.f(pair, pair2, new Pair("endReason", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(endReason))), new Pair("isLast", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(uploaderItem.isLast()))), new Pair("apiKey", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(uploaderItem.getMetadata().getApiKey()))), new Pair("spaceId", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(uploaderItem.getMetadata().getSpaceId()))), new Pair("sessionStartTimeMilliUtc", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(uploaderItem.getMetadata().getSessionStartTimeMillis()))), new Pair("indexInSession", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(uploaderItem.getMetadata().getIndexInSession()))), new Pair("type", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(uploaderItem.getMetadata().getSessionType().getValue()))));
            HashMap<String, Jsonable> clientMetadata = uploaderItem.getClientMetadata();
            if (clientMetadata != null) {
                abstractMapF = MapsKt.m(abstractMapF, MapsKt.q(clientMetadata));
            }
            LinkedHashMap linkedHashMapS = MapsKt.s((Map) getDebugInfo().getValue());
            ArrayList arrayListD0 = CollectionsKt.d0(abstractMapF, this.f);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListD0, 10));
            Iterator it = arrayListD0.iterator();
            while (it.hasNext()) {
                arrayList.add(JsonHelpersKt.toJsonableMap((Map) it.next()));
            }
            linkedHashMapS.put("uploadedChunks", JsonHelpersKt.toJsonableArray(arrayList));
            getDebugInfo().setValue(linkedHashMapS);
            this.f = arrayListD0;
            ((Logger) this.f25811a.getD()).d(TAG, "Chunk was collected");
        }
    }

    @Override // me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager
    public void setEnabled(boolean z) {
        this.isEnabled = z;
        if (z) {
            return;
        }
        this.f = EmptyList.d;
        getDebugInfo().setValue(EmptyMap.d);
    }

    @Override // me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager
    @NotNull
    public MutableStateFlow<Map<String, Jsonable>> getDebugInfo() {
        return this.debugInfo;
    }
}
