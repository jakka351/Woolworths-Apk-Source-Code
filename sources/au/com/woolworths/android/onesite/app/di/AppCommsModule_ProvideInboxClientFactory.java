package au.com.woolworths.android.onesite.app.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.foundation.appcomms.inbox.client.BffDataSource;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxChatbotSessionIdSource;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxUserIdSource;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.AppCommsDatabase;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore.LastChatbotMessageDataStoreKt;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncConfig;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppCommsModule_ProvideInboxClientFactory implements Factory<InboxClient> {
    public static InboxClientImpl a(Context context, FeatureToggleManager featureToggleManager, InboxUserIdSource inboxUserIdSource, InboxChatbotSessionIdSource inboxChatbotSessionIdSource, ShopInboxDataFetcher shopInboxDataFetcher, SwrveDataSource swrveDataSource) {
        Intrinsics.h(context, "context");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(inboxUserIdSource, "inboxUserIdSource");
        Intrinsics.h(inboxChatbotSessionIdSource, "inboxChatbotSessionIdSource");
        InboxClient.Builder builder = new InboxClient.Builder(context, inboxUserIdSource, inboxChatbotSessionIdSource, shopInboxDataFetcher);
        builder.d = featureToggleManager.c(InboxFeature.d);
        if (swrveDataSource != null) {
            builder.f = swrveDataSource;
        }
        Flow flowA = inboxUserIdSource.a();
        SharingStarted sharingStartedA = SharingStarted.Companion.a(3);
        ContextScope contextScope = builder.g;
        StateFlow stateFlowO = FlowKt.O(flowA, contextScope, sharingStartedA, null);
        StateFlow stateFlowO2 = FlowKt.O(builder.d ? inboxChatbotSessionIdSource.a() : FlowKt.v(), contextScope, SharingStarted.Companion.a(3), null);
        RoomDatabase.Builder builderA = Room.a(context, AppCommsDatabase.class, "appcomms.db");
        builderA.l = false;
        builderA.m = true;
        AppCommsDatabase appCommsDatabase = (AppCommsDatabase) builderA.b();
        DataStore dataStore = (DataStore) LastChatbotMessageDataStoreKt.b.getValue(context, LastChatbotMessageDataStoreKt.f8420a[0]);
        InboxMessageDao inboxMessageDaoT = appCommsDatabase.t();
        SyncMetadataDao syncMetadataDaoU = appCommsDatabase.u();
        boolean z = builder.d;
        SyncConfig syncConfig = new SyncConfig(builder.c);
        Clock clock = builder.h;
        Intrinsics.g(clock, "clock");
        BffDataSource bffDataSource = new BffDataSource(new InboxSyncerImpl(stateFlowO, stateFlowO2, shopInboxDataFetcher, inboxMessageDaoT, syncMetadataDaoU, dataStore, z, contextScope, syncConfig, clock), appCommsDatabase.t(), appCommsDatabase.u());
        SwrveDataSource swrveDataSource2 = builder.f;
        if (swrveDataSource2 == null) {
            swrveDataSource2 = SwrveDataSourceImpl.f8433a;
        }
        return new InboxClientImpl(stateFlowO, bffDataSource, swrveDataSource2, dataStore, builder.d, builder.e);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
