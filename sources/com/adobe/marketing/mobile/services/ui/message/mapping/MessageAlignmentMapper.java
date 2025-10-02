package com.adobe.marketing.mobile.services.ui.message.mapping;

import androidx.compose.ui.Alignment;
import com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageAlignmentMapper;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageAlignmentMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13252a;
    public static final Object b;

    static {
        Pair pair = new Pair(InAppMessageSettings.MessageAlignment.g, Alignment.Companion.j);
        Pair pair2 = new Pair(InAppMessageSettings.MessageAlignment.h, Alignment.Companion.l);
        InAppMessageSettings.MessageAlignment messageAlignment = InAppMessageSettings.MessageAlignment.d;
        f13252a = MapsKt.j(pair, pair2, new Pair(messageAlignment, Alignment.Companion.k));
        b = MapsKt.j(new Pair(InAppMessageSettings.MessageAlignment.e, Alignment.Companion.m), new Pair(InAppMessageSettings.MessageAlignment.f, Alignment.Companion.o), new Pair(messageAlignment, Alignment.Companion.n));
    }
}
