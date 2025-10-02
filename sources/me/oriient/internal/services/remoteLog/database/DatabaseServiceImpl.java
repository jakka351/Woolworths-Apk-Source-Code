package me.oriient.internal.services.remoteLog.database;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import com.squareup.sqldelight.TransactionWithoutReturn;
import defpackage.RemoteLoggerFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.remoteLog.models.a;
import me.oriient.internal.services.remoteLog.models.d;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011\"\u0004\b\u0000\u0010\u00102\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00110\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001c\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020 H\u0096@¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J.\u0010,\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001eJ6\u00104\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0096@¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/DatabaseServiceImpl;", "Lme/oriient/internal/services/remoteLog/database/DatabaseService;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "database", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "<init>", "(Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;Lme/oriient/internal/infra/utils/core/time/TimeProvider;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;)V", "Lkotlin/Function1;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabaseQueries;", "", "toExecute", "execute", "(Lkotlin/jvm/functions/Function1;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/utils/core/Outcome;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "executeAndReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/models/d;", "messageData", "upsertMessage", "(Lme/oriient/internal/services/remoteLog/models/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/models/c;", "batchId", "", "getMessages-eK7Yl6k", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "", "countMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "numToDelete", "removeOldestMessages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/models/a;", MlModel.MODEL_FILE_SUFFIX, "upsertBatch", "(Lme/oriient/internal/services/remoteLog/models/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "time", "getBatchesPassedTime", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "removeBatch-eK7Yl6k", "removeBatch", "", "charging", "metered", "getScheduledBatches", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exceptLastMinutes", "clearDb", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "Lkotlinx/coroutines/CoroutineScope;", "databaseCoroutineScope$delegate", "Lkotlin/Lazy;", "getDatabaseCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "databaseCoroutineScope", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatabaseServiceImpl implements DatabaseService {

    @NotNull
    private static final String TAG = "DatabaseService";

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @NotNull
    private final RemoteLogDatabase database;

    /* renamed from: databaseCoroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy databaseCoroutineScope;

    @NotNull
    private final TimeProvider timeProvider;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$execute$1", f = "DatabaseService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<RemoteLogDatabaseQueries, Unit> $toExecute;
        int label;
        final /* synthetic */ DatabaseServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super RemoteLogDatabaseQueries, Unit> function1, DatabaseServiceImpl databaseServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$toExecute = function1;
            this.this$0 = databaseServiceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$toExecute, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                this.$toExecute.invoke(this.this$0.database.getRemoteLogDatabaseQueries());
            } catch (Exception e) {
                Logger logger = RemoteLoggerFactory.INSTANCE.getLogger();
                if (logger != null) {
                    logger.e(DatabaseServiceImpl.TAG, "execute: db operation failed", e);
                }
            }
            return Unit.f24250a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Lme/oriient/internal/infra/utils/core/Outcome;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$executeAndReturn$2", f = "DatabaseService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$executeAndReturn$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14502<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Outcome<T, Exception>>, Object> {
        final /* synthetic */ Function1<RemoteLogDatabaseQueries, Outcome<T, Exception>> $toExecute;
        int label;
        final /* synthetic */ DatabaseServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14502(Function1<? super RemoteLogDatabaseQueries, ? extends Outcome<T, Exception>> function1, DatabaseServiceImpl databaseServiceImpl, Continuation<? super C14502> continuation) {
            super(2, continuation);
            this.$toExecute = function1;
            this.this$0 = databaseServiceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C14502(this.$toExecute, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                return (Outcome) this.$toExecute.invoke(this.this$0.database.getRemoteLogDatabaseQueries());
            } catch (Exception e) {
                Logger logger = RemoteLoggerFactory.INSTANCE.getLogger();
                if (logger != null) {
                    logger.e(DatabaseServiceImpl.TAG, "execute: db operation failed", e);
                }
                return new Outcome.Failure(e);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Outcome<T, Exception>> continuation) {
            return ((C14502) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    public DatabaseServiceImpl(@NotNull RemoteLogDatabase database, @NotNull TimeProvider timeProvider, @NotNull CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(database, "database");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.database = database;
        this.timeProvider = timeProvider;
        this.coroutineContextProvider = coroutineContextProvider;
        this.databaseCoroutineScope = LazyKt.b(new Function0<CoroutineScope>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$databaseCoroutineScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.a(this.this$0.coroutineContextProvider.newSingleThreadCoroutineContext());
            }
        });
    }

    private final void execute(Function1<? super RemoteLogDatabaseQueries, Unit> toExecute) {
        BuildersKt.c(getDatabaseCoroutineScope(), null, null, new AnonymousClass1(toExecute, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object executeAndReturn(Function1<? super RemoteLogDatabaseQueries, ? extends Outcome<T, Exception>> function1, Continuation<? super Outcome<T, Exception>> continuation) {
        return BuildersKt.f(getDatabaseCoroutineScope().getE(), new C14502(function1, this, null), continuation);
    }

    private final CoroutineScope getDatabaseCoroutineScope() {
        return (CoroutineScope) this.databaseCoroutineScope.getD();
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object clearDb(final double d, @NotNull Continuation<? super Unit> continuation) {
        execute(new Function1<RemoteLogDatabaseQueries, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.clearDb.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RemoteLogDatabaseQueries) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull final RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                final long currentTimeMillis = this.timeProvider.getCurrentTimeMillis() - ((long) (d * TimeUnit.MINUTES.toMillis(1L)));
                this.database.transaction(false, new Function1<TransactionWithoutReturn, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.clearDb.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TransactionWithoutReturn) obj);
                        return Unit.f24250a;
                    }

                    public final void invoke(@NotNull TransactionWithoutReturn transaction) {
                        Intrinsics.h(transaction, "$this$transaction");
                        RemoteLogDatabaseQueries remoteLogDatabaseQueries = queries;
                        long j = currentTimeMillis;
                        remoteLogDatabaseQueries.clearBatches(j);
                        remoteLogDatabaseQueries.clearMessages(j);
                    }
                });
            }
        });
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object countMessages(@NotNull Continuation<? super Outcome<Integer, Exception>> continuation) {
        return executeAndReturn(new Function1<RemoteLogDatabaseQueries, Outcome<Integer, Exception>>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.countMessages.2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Outcome<Integer, Exception> invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                return OutcomeKt.toOutcomeSuccess(Integer.valueOf((int) queries.countMessages().executeAsOne().longValue()));
            }
        }, continuation);
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object getBatchesPassedTime(final long j, @NotNull Continuation<? super Outcome<List<a>, Exception>> continuation) {
        return executeAndReturn(new Function1<RemoteLogDatabaseQueries, Outcome<List<? extends a>, Exception>>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.getBatchesPassedTime.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Outcome<List<a>, Exception> invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                List<RemoteLogBatchConfigTable> listExecuteAsList = queries.getPassedTimeBatches(j).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
                Iterator<T> it = listExecuteAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(DatabaseServiceKt.toData((RemoteLogBatchConfigTable) it.next()));
                }
                return OutcomeKt.toOutcomeSuccess(arrayList);
            }
        }, continuation);
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    /* renamed from: getMessages-eK7Yl6k */
    public Object mo394getMessageseK7Yl6k(@NotNull final String str, @NotNull Continuation<? super Outcome<List<d>, Exception>> continuation) {
        return executeAndReturn(new Function1<RemoteLogDatabaseQueries, Outcome<List<? extends d>, Exception>>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$getMessages$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Outcome<List<d>, Exception> invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                List<RemoteLogMessagesTable> listExecuteAsList = queries.getMessagesForBatch(str).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
                Iterator<T> it = listExecuteAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(DatabaseServiceKt.toData((RemoteLogMessagesTable) it.next()));
                }
                return OutcomeKt.toOutcomeSuccess(arrayList);
            }
        }, continuation);
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object getScheduledBatches(final boolean z, final boolean z2, @NotNull Continuation<? super Outcome<List<a>, Exception>> continuation) {
        return executeAndReturn(new Function1<RemoteLogDatabaseQueries, Outcome<List<? extends a>, Exception>>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.getScheduledBatches.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Outcome<List<a>, Exception> invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                boolean z3 = z;
                List<RemoteLogBatchConfigTable> listExecuteAsList = ((!z3 || z2) ? (z3 || z2) ? (z3 && z2) ? queries.getScheduledMeteredBatches() : queries.getScheduledNotChargerMeteredBatches() : queries.getScheduledNotChargerBatches() : queries.getScheduledBatches()).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
                Iterator<T> it = listExecuteAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(DatabaseServiceKt.toData((RemoteLogBatchConfigTable) it.next()));
                }
                return OutcomeKt.toOutcomeSuccess(arrayList);
            }
        }, continuation);
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    /* renamed from: removeBatch-eK7Yl6k */
    public Object mo395removeBatcheK7Yl6k(@NotNull final String str, @NotNull Continuation<? super Unit> continuation) {
        execute(new Function1<RemoteLogDatabaseQueries, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl$removeBatch$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RemoteLogDatabaseQueries) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                queries.removeBatchMessages(str);
                queries.removeBatchConfig(str);
            }
        });
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object removeOldestMessages(final int i, @NotNull Continuation<? super Unit> continuation) {
        execute(new Function1<RemoteLogDatabaseQueries, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.removeOldestMessages.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RemoteLogDatabaseQueries) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                List<GetLastMessagesShort> listExecuteAsList = queries.getLastMessagesShort(i).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
                Iterator<T> it = listExecuteAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((GetLastMessagesShort) it.next()).getTime()));
                }
                queries.removeMessages(arrayList);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
                Iterator<T> it2 = listExecuteAsList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((GetLastMessagesShort) it2.next()).getBatchId());
                }
                queries.removeBatchConfigsWithoutMessages(arrayList2);
            }
        });
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object upsertBatch(@NotNull final a aVar, @NotNull Continuation<? super Unit> continuation) {
        execute(new Function1<RemoteLogDatabaseQueries, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.upsertBatch.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RemoteLogDatabaseQueries) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                a aVar2 = aVar;
                queries.upsertBatchConfig(aVar2.f25539a, aVar2.b, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g);
            }
        });
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.database.DatabaseService
    @Nullable
    public Object upsertMessage(@NotNull final d dVar, @NotNull Continuation<? super Unit> continuation) {
        execute(new Function1<RemoteLogDatabaseQueries, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl.upsertMessage.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RemoteLogDatabaseQueries) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull RemoteLogDatabaseQueries queries) {
                Intrinsics.h(queries, "queries");
                d dVar2 = dVar;
                queries.upsertMessage(dVar2.f25542a, dVar2.b, dVar2.c);
            }
        });
        return Unit.f24250a;
    }
}
