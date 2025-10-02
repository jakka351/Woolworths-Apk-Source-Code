package au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore;

import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.DataStoreSingletonDelegate;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import au.com.woolworths.feature.shop.recipes.recipes.list.b;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox-client_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastChatbotMessageDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8420a = {Reflection.f24268a.h(new PropertyReference1Impl(LastChatbotMessageDataStoreKt.class, "lastChatbotMessageDataStore", "getLastChatbotMessageDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final DataStoreSingletonDelegate b = DataStoreDelegateKt.a("appcomms_last_chatbot_message.json", LastChatbotMessageSerializer.f8423a, new ReplaceFileCorruptionHandler(new b(21)));
}
