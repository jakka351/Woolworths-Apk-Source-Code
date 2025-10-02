package au.com.woolworths.feature.shop.inbox;

import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSection;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSectionItemMapperKt$toSortedSectionsOfItems$$inlined$compareBy$1;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSectionItemMapperKt$toSortedSectionsOfItems$lambda$2$$inlined$sortedByDescending$1;
import au.com.woolworths.feature.shop.inbox.domain.RealInboxTimeSource;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InboxViewModelKt {
    public static final LinkedHashMap a(List list, RealInboxTimeSource inboxTimeSource) {
        Object obj;
        String upperCase;
        Intrinsics.h(list, "<this>");
        Intrinsics.h(inboxTimeSource, "inboxTimeSource");
        List<InboxMessage> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (InboxMessage inboxMessage : list2) {
            Intrinsics.h(inboxMessage, "<this>");
            Instant instant = inboxMessage.i;
            ZoneId zoneId = inboxTimeSource.f7293a;
            Clock clock = inboxTimeSource.b;
            Intrinsics.h(zoneId, "zoneId");
            Intrinsics.h(clock, "clock");
            Duration durationBetween = Duration.between(instant, Instant.now(clock));
            Intrinsics.g(durationBetween, "between(...)");
            long jL = kotlin.time.Duration.l(DurationKt.h(durationBetween.getSeconds(), DurationUnit.h), DurationKt.g(durationBetween.getNano(), DurationUnit.e));
            DurationUnit durationUnit = DurationUnit.j;
            if (kotlin.time.Duration.c(jL, DurationKt.g(1, durationUnit)) < 0) {
                DurationUnit durationUnit2 = DurationUnit.i;
                upperCase = kotlin.time.Duration.c(jL, DurationKt.g(2, durationUnit2)) < 0 ? "1 MINUTE AGO" : kotlin.time.Duration.m(jL, durationUnit2) + " MINUTES AGO";
            } else {
                DurationUnit durationUnit3 = DurationUnit.k;
                if (kotlin.time.Duration.c(jL, DurationKt.g(1, durationUnit3)) < 0) {
                    upperCase = kotlin.time.Duration.c(jL, DurationKt.g(2, durationUnit)) < 0 ? "1 HOUR AGO" : kotlin.time.Duration.m(jL, durationUnit) + " HOURS AGO";
                } else if (kotlin.time.Duration.c(jL, DurationKt.g(7, durationUnit3)) >= 0) {
                    ZonedDateTime zonedDateTimeAtZone = instant.atZone(zoneId);
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("d MMM yyyy");
                    Locale ENGLISH = Locale.ENGLISH;
                    String str = zonedDateTimeAtZone.format(dateTimeFormatterOfPattern.withLocale(ENGLISH));
                    Intrinsics.g(str, "format(...)");
                    Intrinsics.g(ENGLISH, "ENGLISH");
                    upperCase = str.toUpperCase(ENGLISH);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                } else if (kotlin.time.Duration.c(jL, DurationKt.g(2, durationUnit3)) < 0) {
                    upperCase = "1 DAY AGO";
                } else {
                    upperCase = kotlin.time.Duration.m(jL, durationUnit3) + " DAYS AGO";
                }
            }
            arrayList.add(new NotificationItem(inboxMessage, upperCase));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InboxMessage inboxMessage2 = ((NotificationItem) next).f7288a;
            Instant instant2 = inboxMessage2.i;
            boolean z = inboxMessage2.j;
            Clock clock2 = Clock.systemDefaultZone();
            Intrinsics.h(clock2, "clock");
            if (z) {
                Duration durationBetween2 = Duration.between(instant2, Instant.now(clock2));
                Intrinsics.g(durationBetween2, "between(...)");
                long jL2 = kotlin.time.Duration.l(DurationKt.h(durationBetween2.getSeconds(), DurationUnit.h), DurationKt.g(durationBetween2.getNano(), DurationUnit.e));
                DurationUnit durationUnit4 = DurationUnit.k;
                obj = kotlin.time.Duration.c(jL2, DurationKt.g(7, durationUnit4)) < 0 ? NotificationSection.ThisWeek.f7292a : kotlin.time.Duration.c(jL2, DurationKt.g(14, durationUnit4)) < 0 ? NotificationSection.LastWeek.f7289a : NotificationSection.Older.f7291a;
            } else {
                obj = NotificationSection.New.f7290a;
            }
            Object arrayList2 = linkedHashMap.get(obj);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(obj, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        TreeMap treeMapT = MapsKt.t(linkedHashMap, new NotificationSectionItemMapperKt$toSortedSectionsOfItems$$inlined$compareBy$1());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(treeMapT.size()));
        for (Map.Entry entry : treeMapT.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.g(value, "<get-value>(...)");
            linkedHashMap2.put(key, CollectionsKt.u0(new NotificationSectionItemMapperKt$toSortedSectionsOfItems$lambda$2$$inlined$sortedByDescending$1(), (Iterable) value));
        }
        return linkedHashMap2;
    }
}
