package step3.Controller;

import step3.domain.Ladder;
import step3.domain.Participants;
import step3.domain.Rewards;
import step3.utils.SpliterUtil;
import step3.view.InputUi;
import step3.view.OutputUi;

public class LadderGameController {

    public static void start() {
        Participants participants = Participants.of(SpliterUtil.splitNames(InputUi.nameOfParticipate()));
        Rewards rewards = Rewards.of(SpliterUtil.splitNames(InputUi.inputExecutionResult()));

        int maxHeight = InputUi.maximumHeight();

        Ladder ladder = Ladder.of(participants.getParticipants().size(), maxHeight);

        OutputUi.printLadder(participants, rewards, ladder);

//        InputUi.wantToSeeResult()
        InputUi.close();
    }

}
