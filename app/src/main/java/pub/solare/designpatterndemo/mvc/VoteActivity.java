package pub.solare.designpatterndemo.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import pub.solare.designpatterndemo.R;
import pub.solare.designpatterndemo.Utils;

public class VoteActivity extends AppCompatActivity implements IVoteView {

    private TextView mCount, mTitle;
    private Button mVoteBtn;

    private IVoteController mVoteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.getInstance().setVoteView(this);
        initView();
        mVoteController = new VoteController();

    }

    private void initView() {
        mCount = findViewById(R.id.voteCount);
        mTitle = findViewById(R.id.voteTitle);
        mVoteBtn = findViewById(R.id.button);

        mCount.setText("0");
        mTitle.setText("MVC Please vote me!");
        mVoteBtn.setText("Vote");
        mVoteBtn.setOnClickListener(view->onVote());
    }

    private void onVote() {
        if (mVoteController != null) mVoteController.vote();
    }

    @Override
    public void onVoteResult() {
        Log.v("Solare", "onVoteResult");
        mCount.setText("1");
    }
}