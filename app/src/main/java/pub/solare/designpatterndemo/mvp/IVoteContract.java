package pub.solare.designpatterndemo.mvp;

public interface IVoteContract {

    interface IVoteView {
        void onVoteResult();
    }

    interface IVotePresenter {
        void vote();
    }

    interface IVotePresenterCallback {
        void onVoteResult();
    }

    interface IVoteModel {
        void vote();
    }
}
