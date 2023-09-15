#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

typedef struct {
    char* word;
    char* clue;
} WordCluePair;

WordCluePair getWordAndClue(int difficulty) {
    WordCluePair easyPairs[5] = {
        { "copy", "Duplicate" },
        { "house", "Place to live" },
        { "chair", "Furniture item" },
        { "book", "Reading material" },
        { "lamp", "Source of light" }
    };

    WordCluePair mediumPairs[5] = {
        { "register", "Enroll" },
        { "coding", "Programming" },
        { "workshop", "Educational event" },
        { "safeguard", "Protection measure" },
        { "beauty", "Aesthetic appeal" }
    };

    WordCluePair hardPairs[5] = {
        { "exams", "Tests" },
        { "challenging", "Demanding" },
        { "encryption", "Data security" },
        { "algorithm", "Problem-solving approach" },
        { "complexity", "Degree of difficulty" }
    };

    WordCluePair* selectedPairs;
    int numPairs;

    switch (difficulty) {
        case 1:
            selectedPairs = easyPairs;
            numPairs = 5;
            break;
        case 2:
            selectedPairs = mediumPairs;
            numPairs = 5;
            break;
        case 3:
            selectedPairs = hardPairs;
            numPairs = 5;
            break;
        default:
            selectedPairs = easyPairs;
            numPairs = 5;
            break;
    }

    int index = rand() % numPairs;

    return selectedPairs[index];
}

int main() {
    char name[100];
    printf("Enter Name: ");
    scanf("%s", name);
    printf("\n");
    int score = 0;
    char input;
    int difficulty;

    do {
        system("cls");

        printf("************************************CROSSWORD PUZZLE************************************\n");

        printf("Select Difficulty Level:\n");
        printf("1. Easy\n");
        printf("2. Medium\n");
        printf("3. Hard\n");
        printf("Enter your choice (1/2/3): ");
        scanf("%d", &difficulty);

        srand(time(NULL));
        WordCluePair selectedPair = getWordAndClue(difficulty);

        char* selectedWord = selectedPair.word;
        char* clue = selectedPair.clue;

        char puzzle[9][9];

        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                do {
                    puzzle[i][j] = rand() % 26 + 'a';
                } while (!(puzzle[i][j] >= 'a' && puzzle[i][j] <= 'z'));
            }
        }

        int r, c;
        if (strlen(selectedWord) % 2 != 0) {
            r = rand() % 10;
            c = rand() % 1;
            int x;
            for (x = 0; selectedWord[x] != '\0'; x++, c++) {
                puzzle[r][c] = selectedWord[x];
            }
        } else {
            r = rand() % 2;
            c = rand() % 10;
            int x;
            for (x = 0; selectedWord[x] != '\0'; x++, r++) {
                puzzle[r][c] = selectedWord[x];
            }
        }

        printf("\nClue: %s\n", clue);
        printf("\n");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                printf("%c ", puzzle[i][j]);
            }
            printf("\n");
        }

        char answer[100];
        printf("\nEnter word that is of length %lu\n", strlen(selectedWord));
        scanf("%s", answer);
        if (strcmp(answer, selectedWord) == 0) {
            score = score + 1;
            printf("You won!!!\n");
        } else {
            printf("You lost!!!\n");
        }

        printf("Play again? (y/n)");
        scanf(" %c", &input);

    } while (input != 'n');

    printf("****************************GAME OVER****************************\n");
    printf("%s\nYour score is: %d\n\n\n\n", name, score);
    return 0;
}
