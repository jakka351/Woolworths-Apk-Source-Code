package com.salesforce.marketingcloud.messages.inbox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import java.util.List;

@MCKeep
/* loaded from: classes6.dex */
public interface InboxMessageManager {

    @RestrictTo
    public static final String TAG = g.a("InboxMessageManager");

    @MCKeep
    public interface InboxRefreshListener {
        void onRefreshComplete(boolean z);
    }

    @MCKeep
    public interface InboxResponseListener {
        void onInboxMessagesChanged(@NonNull List<InboxMessage> list);
    }

    void deleteMessage(@NonNull InboxMessage inboxMessage);

    void deleteMessage(@NonNull String str);

    void disableInbox();

    void enableInbox();

    int getDeletedMessageCount();

    @NonNull
    List<InboxMessage> getDeletedMessages();

    int getMessageCount();

    @NonNull
    List<InboxMessage> getMessages();

    int getReadMessageCount();

    @NonNull
    List<InboxMessage> getReadMessages();

    int getUnreadMessageCount();

    @NonNull
    List<InboxMessage> getUnreadMessages();

    boolean isInboxEnabled();

    void markAllMessagesDeleted();

    void markAllMessagesRead();

    void refreshInbox(@Nullable InboxRefreshListener inboxRefreshListener);

    void registerInboxResponseListener(@NonNull InboxResponseListener inboxResponseListener);

    void setMessageRead(@NonNull InboxMessage inboxMessage);

    void setMessageRead(@NonNull String str);

    void unregisterInboxResponseListener(@NonNull InboxResponseListener inboxResponseListener);
}
