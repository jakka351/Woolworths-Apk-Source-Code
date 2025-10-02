package com.adobe.marketing.mobile.services.ui.message.mapping;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageArrangementMapper;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageArrangementMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13254a;
    public static final Object b;

    static {
        Pair pair = new Pair(InAppMessageSettings.MessageAlignment.e, Arrangement.f934a);
        Pair pair2 = new Pair(InAppMessageSettings.MessageAlignment.f, Arrangement.b);
        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
        InAppMessageSettings.MessageAlignment messageAlignment = InAppMessageSettings.MessageAlignment.d;
        f13254a = MapsKt.j(pair, pair2, new Pair(messageAlignment, arrangement$Center$1));
        b = MapsKt.j(new Pair(InAppMessageSettings.MessageAlignment.g, Arrangement.c), new Pair(InAppMessageSettings.MessageAlignment.h, Arrangement.d), new Pair(messageAlignment, arrangement$Center$1));
    }
}
