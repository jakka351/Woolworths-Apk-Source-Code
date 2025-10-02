package au.com.woolworths.foundation.shop.chatbot.session;

import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.DataStoreSingletonDelegate;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import au.com.woolworths.android.onesite.analytics.a11y.a;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chatbot-session_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatbotSessionDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8702a = {Reflection.f24268a.h(new PropertyReference1Impl(ChatbotSessionDataStoreKt.class, "chatbotSessionDataStore", "getChatbotSessionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final DataStoreSingletonDelegate b = DataStoreDelegateKt.a("chatbot_session.json", ChatbotSessionSerializer.f8703a, new ReplaceFileCorruptionHandler(new a(11)));
}
