package com.google.apphosting.datastore.testing;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitResponse;
import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.DeleteDocumentRequest;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DatastoreTestTrace {

    /* renamed from: com.google.apphosting.datastore.testing.DatastoreTestTrace$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14845a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14845a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14845a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14845a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14845a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14845a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14845a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14845a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class DatastoreAction extends GeneratedMessageLite<DatastoreAction, Builder> implements DatastoreActionOrBuilder {
        public static final int ACTION_ID_FIELD_NUMBER = 200;
        private static final DatastoreAction DEFAULT_INSTANCE;
        public static final int FIRESTORE_V1_ACTION_FIELD_NUMBER = 3;
        private static volatile Parser<DatastoreAction> PARSER = null;
        public static final int VALIDATION_RULE_FIELD_NUMBER = 201;
        private int actionCase_ = 0;
        private int actionId_;
        private Object action_;
        private int bitField0_;
        private ValidationRule validationRule_;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ActionCase {
            public static final /* synthetic */ ActionCase[] d = {new ActionCase("FIRESTORE_V1_ACTION", 0), new ActionCase("ACTION_NOT_SET", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            ActionCase EF5;

            public static ActionCase valueOf(String str) {
                return (ActionCase) Enum.valueOf(ActionCase.class, str);
            }

            public static ActionCase[] values() {
                return (ActionCase[]) d.clone();
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DatastoreAction, Builder> implements DatastoreActionOrBuilder {
        }

        static {
            DatastoreAction datastoreAction = new DatastoreAction();
            DEFAULT_INSTANCE = datastoreAction;
            GeneratedMessageLite.J(DatastoreAction.class, datastoreAction);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0003É\u0003\u0000\u0000\u0000\u0003<\u0000È\u0004Éဉ\u0000", new Object[]{"action_", "actionCase_", "bitField0_", FirestoreV1Action.class, "actionId_", "validationRule_"});
                case 3:
                    return new DatastoreAction();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<DatastoreAction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DatastoreAction.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface DatastoreActionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FirestoreV1Action extends GeneratedMessageLite<FirestoreV1Action, Builder> implements FirestoreV1ActionOrBuilder {
        public static final int BATCH_GET_DOCUMENTS_FIELD_NUMBER = 10;
        public static final int BEGIN_TRANSACTION_FIELD_NUMBER = 6;
        public static final int COMMIT_FIELD_NUMBER = 7;
        public static final int CREATE_DOCUMENT_FIELD_NUMBER = 3;
        public static final int DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER = 202;
        private static final FirestoreV1Action DEFAULT_INSTANCE;
        public static final int DELETE_DOCUMENT_FIELD_NUMBER = 5;
        public static final int GET_DOCUMENT_FIELD_NUMBER = 1;
        public static final int LISTEN_FIELD_NUMBER = 12;
        public static final int LIST_COLLECTION_IDS_FIELD_NUMBER = 9;
        public static final int LIST_DOCUMENTS_FIELD_NUMBER = 2;
        public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 203;
        private static volatile Parser<FirestoreV1Action> PARSER = null;
        public static final int REMOVE_LISTEN_FIELD_NUMBER = 13;
        public static final int ROLLBACK_FIELD_NUMBER = 8;
        public static final int RUN_QUERY_FIELD_NUMBER = 11;
        public static final int STATUS_FIELD_NUMBER = 201;
        public static final int UPDATE_DOCUMENT_FIELD_NUMBER = 4;
        private Object action_;
        private int bitField0_;
        private RunQuery databaseContentsBeforeAction_;
        private StatusProto status_;
        private int actionCase_ = 0;
        private Internal.ProtobufList<MatchingDocuments> matchingDocuments_ = GeneratedMessageLite.w();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ActionCase {
            public static final /* synthetic */ ActionCase[] d = {new ActionCase("GET_DOCUMENT", 0), new ActionCase("LIST_DOCUMENTS", 1), new ActionCase("CREATE_DOCUMENT", 2), new ActionCase("UPDATE_DOCUMENT", 3), new ActionCase("DELETE_DOCUMENT", 4), new ActionCase("BEGIN_TRANSACTION", 5), new ActionCase("COMMIT", 6), new ActionCase("ROLLBACK", 7), new ActionCase("LIST_COLLECTION_IDS", 8), new ActionCase("BATCH_GET_DOCUMENTS", 9), new ActionCase("RUN_QUERY", 10), new ActionCase("LISTEN", 11), new ActionCase("REMOVE_LISTEN", 12), new ActionCase("ACTION_NOT_SET", 13)};

            /* JADX INFO: Fake field, exist only in values array */
            ActionCase EF5;

            public static ActionCase valueOf(String str) {
                return (ActionCase) Enum.valueOf(ActionCase.class, str);
            }

            public static ActionCase[] values() {
                return (ActionCase[]) d.clone();
            }
        }

        public static final class BatchGetDocuments extends GeneratedMessageLite<BatchGetDocuments, Builder> implements BatchGetDocumentsOrBuilder {
            private static final BatchGetDocuments DEFAULT_INSTANCE;
            private static volatile Parser<BatchGetDocuments> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private BatchGetDocumentsRequest request_;
            private Internal.ProtobufList<BatchGetDocumentsResponse> response_ = GeneratedMessageLite.w();

            public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocuments, Builder> implements BatchGetDocumentsOrBuilder {
            }

            static {
                BatchGetDocuments batchGetDocuments = new BatchGetDocuments();
                DEFAULT_INSTANCE = batchGetDocuments;
                GeneratedMessageLite.J(BatchGetDocuments.class, batchGetDocuments);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", BatchGetDocumentsResponse.class});
                    case 3:
                        return new BatchGetDocuments();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<BatchGetDocuments> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BatchGetDocuments.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface BatchGetDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class BeginTransaction extends GeneratedMessageLite<BeginTransaction, Builder> implements BeginTransactionOrBuilder {
            private static final BeginTransaction DEFAULT_INSTANCE;
            private static volatile Parser<BeginTransaction> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private BeginTransactionRequest request_;
            private BeginTransactionResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<BeginTransaction, Builder> implements BeginTransactionOrBuilder {
            }

            static {
                BeginTransaction beginTransaction = new BeginTransaction();
                DEFAULT_INSTANCE = beginTransaction;
                GeneratedMessageLite.J(BeginTransaction.class, beginTransaction);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new BeginTransaction();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<BeginTransaction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BeginTransaction.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface BeginTransactionOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FirestoreV1Action, Builder> implements FirestoreV1ActionOrBuilder {
        }

        public static final class Commit extends GeneratedMessageLite<Commit, Builder> implements CommitOrBuilder {
            private static final Commit DEFAULT_INSTANCE;
            private static volatile Parser<Commit> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private CommitRequest request_;
            private CommitResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Commit, Builder> implements CommitOrBuilder {
            }

            static {
                Commit commit = new Commit();
                DEFAULT_INSTANCE = commit;
                GeneratedMessageLite.J(Commit.class, commit);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new Commit();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Commit> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Commit.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface CommitOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class CreateDocument extends GeneratedMessageLite<CreateDocument, Builder> implements CreateDocumentOrBuilder {
            private static final CreateDocument DEFAULT_INSTANCE;
            private static volatile Parser<CreateDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private CreateDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<CreateDocument, Builder> implements CreateDocumentOrBuilder {
            }

            static {
                CreateDocument createDocument = new CreateDocument();
                DEFAULT_INSTANCE = createDocument;
                GeneratedMessageLite.J(CreateDocument.class, createDocument);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new CreateDocument();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<CreateDocument> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CreateDocument.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface CreateDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class DeleteDocument extends GeneratedMessageLite<DeleteDocument, Builder> implements DeleteDocumentOrBuilder {
            private static final DeleteDocument DEFAULT_INSTANCE;
            private static volatile Parser<DeleteDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private DeleteDocumentRequest request_;
            private Empty response_;

            public static final class Builder extends GeneratedMessageLite.Builder<DeleteDocument, Builder> implements DeleteDocumentOrBuilder {
            }

            static {
                DeleteDocument deleteDocument = new DeleteDocument();
                DEFAULT_INSTANCE = deleteDocument;
                GeneratedMessageLite.J(DeleteDocument.class, deleteDocument);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new DeleteDocument();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<DeleteDocument> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DeleteDocument.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface DeleteDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class GetDocument extends GeneratedMessageLite<GetDocument, Builder> implements GetDocumentOrBuilder {
            private static final GetDocument DEFAULT_INSTANCE;
            private static volatile Parser<GetDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private GetDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<GetDocument, Builder> implements GetDocumentOrBuilder {
            }

            static {
                GetDocument getDocument = new GetDocument();
                DEFAULT_INSTANCE = getDocument;
                GeneratedMessageLite.J(GetDocument.class, getDocument);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new GetDocument();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<GetDocument> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (GetDocument.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface GetDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class ListCollectionIds extends GeneratedMessageLite<ListCollectionIds, Builder> implements ListCollectionIdsOrBuilder {
            private static final ListCollectionIds DEFAULT_INSTANCE;
            private static volatile Parser<ListCollectionIds> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private ListCollectionIdsRequest request_;
            private ListCollectionIdsResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<ListCollectionIds, Builder> implements ListCollectionIdsOrBuilder {
            }

            static {
                ListCollectionIds listCollectionIds = new ListCollectionIds();
                DEFAULT_INSTANCE = listCollectionIds;
                GeneratedMessageLite.J(ListCollectionIds.class, listCollectionIds);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new ListCollectionIds();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<ListCollectionIds> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ListCollectionIds.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface ListCollectionIdsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class ListDocuments extends GeneratedMessageLite<ListDocuments, Builder> implements ListDocumentsOrBuilder {
            private static final ListDocuments DEFAULT_INSTANCE;
            private static volatile Parser<ListDocuments> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private ListDocumentsRequest request_;
            private ListDocumentsResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<ListDocuments, Builder> implements ListDocumentsOrBuilder {
            }

            static {
                ListDocuments listDocuments = new ListDocuments();
                DEFAULT_INSTANCE = listDocuments;
                GeneratedMessageLite.J(ListDocuments.class, listDocuments);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new ListDocuments();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<ListDocuments> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ListDocuments.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface ListDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Listen extends GeneratedMessageLite<Listen, Builder> implements ListenOrBuilder {
            private static final Listen DEFAULT_INSTANCE;
            private static volatile Parser<Listen> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private ListenRequest request_;
            private ListenResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Listen, Builder> implements ListenOrBuilder {
            }

            static {
                Listen listen = new Listen();
                DEFAULT_INSTANCE = listen;
                GeneratedMessageLite.J(Listen.class, listen);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new Listen();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Listen> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Listen.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface ListenOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class MatchingDocuments extends GeneratedMessageLite<MatchingDocuments, Builder> implements MatchingDocumentsOrBuilder {
            private static final MatchingDocuments DEFAULT_INSTANCE;
            public static final int LISTEN_RESPONSE_FIELD_NUMBER = 1;
            public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 2;
            private static volatile Parser<MatchingDocuments> PARSER;
            private int bitField0_;
            private ListenResponse listenResponse_;
            private RunQueryResponse matchingDocuments_;

            public static final class Builder extends GeneratedMessageLite.Builder<MatchingDocuments, Builder> implements MatchingDocumentsOrBuilder {
            }

            static {
                MatchingDocuments matchingDocuments = new MatchingDocuments();
                DEFAULT_INSTANCE = matchingDocuments;
                GeneratedMessageLite.J(MatchingDocuments.class, matchingDocuments);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "listenResponse_", "matchingDocuments_"});
                    case 3:
                        return new MatchingDocuments();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<MatchingDocuments> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (MatchingDocuments.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface MatchingDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class RemoveListen extends GeneratedMessageLite<RemoveListen, Builder> implements RemoveListenOrBuilder {
            private static final RemoveListen DEFAULT_INSTANCE;
            private static volatile Parser<RemoveListen> PARSER = null;
            public static final int TARGET_ID_FIELD_NUMBER = 1;
            private int targetId_;

            public static final class Builder extends GeneratedMessageLite.Builder<RemoveListen, Builder> implements RemoveListenOrBuilder {
            }

            static {
                RemoveListen removeListen = new RemoveListen();
                DEFAULT_INSTANCE = removeListen;
                GeneratedMessageLite.J(RemoveListen.class, removeListen);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"targetId_"});
                    case 3:
                        return new RemoveListen();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<RemoveListen> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (RemoveListen.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface RemoveListenOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Rollback extends GeneratedMessageLite<Rollback, Builder> implements RollbackOrBuilder {
            private static final Rollback DEFAULT_INSTANCE;
            private static volatile Parser<Rollback> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private RollbackRequest request_;
            private Empty response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Rollback, Builder> implements RollbackOrBuilder {
            }

            static {
                Rollback rollback = new Rollback();
                DEFAULT_INSTANCE = rollback;
                GeneratedMessageLite.J(Rollback.class, rollback);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new Rollback();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Rollback> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Rollback.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface RollbackOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class RunQuery extends GeneratedMessageLite<RunQuery, Builder> implements RunQueryOrBuilder {
            private static final RunQuery DEFAULT_INSTANCE;
            private static volatile Parser<RunQuery> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private RunQueryRequest request_;
            private Internal.ProtobufList<RunQueryResponse> response_ = GeneratedMessageLite.w();

            public static final class Builder extends GeneratedMessageLite.Builder<RunQuery, Builder> implements RunQueryOrBuilder {
            }

            static {
                RunQuery runQuery = new RunQuery();
                DEFAULT_INSTANCE = runQuery;
                GeneratedMessageLite.J(RunQuery.class, runQuery);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", RunQueryResponse.class});
                    case 3:
                        return new RunQuery();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<RunQuery> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (RunQuery.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface RunQueryOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class UpdateDocument extends GeneratedMessageLite<UpdateDocument, Builder> implements UpdateDocumentOrBuilder {
            private static final UpdateDocument DEFAULT_INSTANCE;
            private static volatile Parser<UpdateDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private UpdateDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<UpdateDocument, Builder> implements UpdateDocumentOrBuilder {
            }

            static {
                UpdateDocument updateDocument = new UpdateDocument();
                DEFAULT_INSTANCE = updateDocument;
                GeneratedMessageLite.J(UpdateDocument.class, updateDocument);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
                Parser defaultInstanceBasedParser;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 3:
                        return new UpdateDocument();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<UpdateDocument> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (UpdateDocument.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public interface UpdateDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            FirestoreV1Action firestoreV1Action = new FirestoreV1Action();
            DEFAULT_INSTANCE = firestoreV1Action;
            GeneratedMessageLite.J(FirestoreV1Action.class, firestoreV1Action);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001Ë\u0010\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000Éဉ\u0000Êဉ\u0001Ë\u001b", new Object[]{"action_", "actionCase_", "bitField0_", GetDocument.class, ListDocuments.class, CreateDocument.class, UpdateDocument.class, DeleteDocument.class, BeginTransaction.class, Commit.class, Rollback.class, ListCollectionIds.class, BatchGetDocuments.class, RunQuery.class, Listen.class, RemoveListen.class, "status_", "databaseContentsBeforeAction_", "matchingDocuments_", MatchingDocuments.class});
                case 3:
                    return new FirestoreV1Action();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<FirestoreV1Action> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FirestoreV1Action.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface FirestoreV1ActionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ParallelTestTrace extends GeneratedMessageLite<ParallelTestTrace, Builder> implements ParallelTestTraceOrBuilder {
        private static final ParallelTestTrace DEFAULT_INSTANCE;
        private static volatile Parser<ParallelTestTrace> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TestTrace testTrace_;

        public static final class Builder extends GeneratedMessageLite.Builder<ParallelTestTrace, Builder> implements ParallelTestTraceOrBuilder {
        }

        static {
            ParallelTestTrace parallelTestTrace = new ParallelTestTrace();
            DEFAULT_INSTANCE = parallelTestTrace;
            GeneratedMessageLite.J(ParallelTestTrace.class, parallelTestTrace);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "testTrace_"});
                case 3:
                    return new ParallelTestTrace();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<ParallelTestTrace> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ParallelTestTrace.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ParallelTestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StatusProto extends GeneratedMessageLite<StatusProto, Builder> implements StatusProtoOrBuilder {
        public static final int CANONICAL_CODE_FIELD_NUMBER = 6;
        public static final int CODE_FIELD_NUMBER = 1;
        private static final StatusProto DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        private static volatile Parser<StatusProto> PARSER = null;
        public static final int SPACE_FIELD_NUMBER = 2;
        private int canonicalCode_;
        private int code_;
        private String space_ = "";
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<StatusProto, Builder> implements StatusProtoOrBuilder {
        }

        static {
            StatusProto statusProto = new StatusProto();
            DEFAULT_INSTANCE = statusProto;
            GeneratedMessageLite.J(StatusProto.class, statusProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0006\u0004", new Object[]{"code_", "space_", "message_", "canonicalCode_"});
                case 3:
                    return new StatusProto();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<StatusProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StatusProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface StatusProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class TestTrace extends GeneratedMessageLite<TestTrace, Builder> implements TestTraceOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final TestTrace DEFAULT_INSTANCE;
        private static volatile Parser<TestTrace> PARSER = null;
        public static final int TRACE_DESCRIPTION_FIELD_NUMBER = 3;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        private String traceId_ = "";
        private Internal.ProtobufList<DatastoreAction> action_ = GeneratedMessageLite.w();
        private String traceDescription_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<TestTrace, Builder> implements TestTraceOrBuilder {
        }

        static {
            TestTrace testTrace = new TestTrace();
            DEFAULT_INSTANCE = testTrace;
            GeneratedMessageLite.J(TestTrace.class, testTrace);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"traceId_", "action_", DatastoreAction.class, "traceDescription_"});
                case 3:
                    return new TestTrace();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<TestTrace> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TestTrace.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface TestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class TimelineTestTrace extends GeneratedMessageLite<TimelineTestTrace, Builder> implements TimelineTestTraceOrBuilder {
        private static final TimelineTestTrace DEFAULT_INSTANCE;
        private static volatile Parser<TimelineTestTrace> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TestTrace testTrace_;

        public static final class Builder extends GeneratedMessageLite.Builder<TimelineTestTrace, Builder> implements TimelineTestTraceOrBuilder {
        }

        static {
            TimelineTestTrace timelineTestTrace = new TimelineTestTrace();
            DEFAULT_INSTANCE = timelineTestTrace;
            GeneratedMessageLite.J(TimelineTestTrace.class, timelineTestTrace);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "testTrace_"});
                case 3:
                    return new TimelineTestTrace();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<TimelineTestTrace> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TimelineTestTrace.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface TimelineTestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValidationRule extends GeneratedMessageLite<ValidationRule, Builder> implements ValidationRuleOrBuilder {
        private static final ValidationRule DEFAULT_INSTANCE;
        private static volatile Parser<ValidationRule> PARSER = null;
        public static final int VALIDATE_QUERY_INDEXES_FIELD_NUMBER = 2;
        public static final int VALIDATE_QUERY_RESULT_ORDER_FIELD_NUMBER = 1;
        private boolean validateQueryIndexes_;
        private boolean validateQueryResultOrder_;

        public static final class Builder extends GeneratedMessageLite.Builder<ValidationRule, Builder> implements ValidationRuleOrBuilder {
        }

        static {
            ValidationRule validationRule = new ValidationRule();
            DEFAULT_INSTANCE = validationRule;
            GeneratedMessageLite.J(ValidationRule.class, validationRule);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"validateQueryResultOrder_", "validateQueryIndexes_"});
                case 3:
                    return new ValidationRule();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<ValidationRule> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ValidationRule.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ValidationRuleOrBuilder extends MessageLiteOrBuilder {
    }
}
