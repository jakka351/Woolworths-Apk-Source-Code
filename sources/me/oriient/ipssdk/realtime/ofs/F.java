package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryRecord;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryResult;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCategoryLocationListener;
import me.oriient.ipssdk.api.models.IPSCategoryLocation;
import me.oriient.ipssdk.api.models.IPSCategoryLocationSearchResult;
import me.oriient.ipssdk.realtime.ips.Content;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* loaded from: classes8.dex */
public final class F extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25935a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IPSCategoryLocationListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, String str2, IPSCategoryLocationListener iPSCategoryLocationListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = iPSCategoryLocationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new F(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IPSCategoryLocationSearchResult iPSCategoryLocationSearchResult;
        List<PlaiCategoryRecord> allRecords;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25935a;
        if (i == 0) {
            ResultKt.b(obj);
            PlaiCategoriesRepository plaiCategoriesRepositoryAccess$getPlaiCategoriesRepository = Content.access$getPlaiCategoriesRepository(Content.INSTANCE);
            String str = this.b;
            String str2 = this.c;
            this.f25935a = 1;
            obj = plaiCategoriesRepositoryAccess$getPlaiCategoriesRepository.getCategoryInfo(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        IPSCategoryLocationListener iPSCategoryLocationListener = this.d;
        if (outcome instanceof Outcome.Failure) {
            iPSCategoryLocationListener.onError(ExtensionsKt.toIpsError((OriientError) ((Outcome.Failure) outcome).getValue()));
        }
        String str3 = this.b;
        String str4 = this.c;
        IPSCategoryLocationListener iPSCategoryLocationListener2 = this.d;
        if (outcome instanceof Outcome.Success) {
            PlaiCategoryResult plaiCategoryResult = (PlaiCategoryResult) ((Outcome.Success) outcome).getValue();
            Content content = Content.INSTANCE;
            ELog eLogAccess$getElog = Content.access$getElog(content);
            Pair pair = new Pair("buildingId", str3);
            Pair pair2 = new Pair("categoryId", str4);
            int size = 0;
            Pair pair3 = new Pair("hasCategoryLocation", Boolean.valueOf(plaiCategoryResult != null));
            if (plaiCategoryResult != null && (allRecords = plaiCategoryResult.getAllRecords()) != null) {
                size = allRecords.size();
            }
            eLogAccess$getElog.i("Content", "Get category response", MapsKt.j(pair, pair2, pair3, new Pair("categoryLocationsCount", new Integer(size))));
            if (plaiCategoryResult != null) {
                IPSCategoryLocation iPSCategoryLocationAccess$categoryLocationFromRecord = Content.access$categoryLocationFromRecord(content, plaiCategoryResult.getPrimaryRecord());
                List<PlaiCategoryRecord> allRecords2 = plaiCategoryResult.getAllRecords();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(allRecords2, 10));
                Iterator<T> it = allRecords2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Content.access$categoryLocationFromRecord(Content.INSTANCE, (PlaiCategoryRecord) it.next()));
                }
                iPSCategoryLocationSearchResult = new IPSCategoryLocationSearchResult(str3, str4, iPSCategoryLocationAccess$categoryLocationFromRecord, arrayList);
            } else {
                iPSCategoryLocationSearchResult = null;
            }
            iPSCategoryLocationListener2.onSuccess(iPSCategoryLocationSearchResult);
        }
        return Unit.f24250a;
    }
}
